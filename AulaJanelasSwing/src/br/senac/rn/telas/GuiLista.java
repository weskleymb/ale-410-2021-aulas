package br.senac.rn.telas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLista extends JPanel {

    private JList listaDeDescontos;
    private JScrollPane barraDeRolagem;
    private JButton botaoCalcular;
    private JLabel rotuloValor;
    private JTextField campoValor, campoValorDoDesconto;

    public GuiLista() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);

        String descontos[] = {"10%", "20%", "30%", "40%", "50%"};
        listaDeDescontos = new JList(descontos);

        barraDeRolagem = new JScrollPane(listaDeDescontos);
        barraDeRolagem.setBounds(35, 60, 100, 55);
        add(barraDeRolagem);

        rotuloValor = new JLabel("Valor");
        rotuloValor.setBounds(35, 5, 100, 25);
        add(rotuloValor);

        botaoCalcular = new JButton("Calcular");
        botaoCalcular.setBounds(35, 120, 90, 25);
        add(botaoCalcular);

        campoValor = new JTextField();
        campoValor.setBounds(35, 30, 100, 25);
        add(campoValor);

        campoValorDoDesconto = new JTextField();
        campoValorDoDesconto.setBounds(35, 150, 100, 25);
        add(campoValorDoDesconto);
    }

    private void definirEventos() {
        botaoCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularDesconto();
            }
        });
    }

    private void calcularDesconto() {
        if (verificarCampoValorEmBranco()) return;
        if (verificarCampoValorNumerico()) return;
        Double desconto = descontoSelecionado();
        Double valor = Double.valueOf(campoValor.getText());
        Double valorComDesconto = valor * desconto;
        campoValorDoDesconto.setText(valorComDesconto.toString());
    }

    private Double descontoSelecionado() {
        Double desconto = 0.9;
        if (listaDeDescontos.getSelectedIndex() == 1) {
            desconto = 0.8;
        } else if (listaDeDescontos.getSelectedIndex() == 2) {
            desconto = 0.7;
        } else if (listaDeDescontos.getSelectedIndex() == 3) {
            desconto = 0.6;
        } else if (listaDeDescontos.getSelectedIndex() == 4) {
            desconto = 0.5;
        }
        return desconto;
    }

    private Boolean verificarCampoValorEmBranco() {
        if (campoValor.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Valor obrigatório");
            campoValor.setText("");
            campoValor.requestFocus();
            return true;
        }
        return false;
    }

    private Boolean verificarCampoValorNumerico() {
        try {
            Double.valueOf(campoValor.getText());
            return true;
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Valor deve ser um número");
            campoValor.setText("");
            campoValor.requestFocus();
        }
        return false;
    }

}
