package br.senac.rn.telas;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiCaixaOpcao extends JPanel {

    private JCheckBox opcaoIngles, opcaoInformatica;
    private JButton botaoMarcar, botaoDesmarcar, botaoVerificar;

    public GuiCaixaOpcao() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);

        opcaoIngles = new JCheckBox("Inglês");
        opcaoInformatica = new JCheckBox("Informática");

        opcaoIngles.setBounds(15, 15, 100, 25);
        opcaoInformatica.setBounds(15, 40, 100, 25);

        add(opcaoIngles);
        add(opcaoInformatica);

        botaoMarcar = new JButton("Marcar");
        botaoDesmarcar = new JButton("Desmarcar");
        botaoVerificar = new JButton("Verificar");

        botaoMarcar.setBounds(20, 100, 100, 20);
        botaoDesmarcar.setBounds(20, 130, 100, 20);
        botaoVerificar.setBounds(20, 70, 100, 20);

        add(botaoMarcar);
        add(botaoDesmarcar);
        add(botaoVerificar);
    }

    private void definirEventos() {
        botaoMarcar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opcaoIngles.setSelected(true);
                opcaoInformatica.setSelected(true);
            }
        });
        botaoDesmarcar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opcaoIngles.setSelected(false);
                opcaoInformatica.setSelected(false);
            }
        });
        botaoVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder resposta = new StringBuilder();
                resposta.append("Selecionados:");
                if (opcaoIngles.isSelected()) {
                    resposta.append("\n- Inglês");
                }
                if (opcaoInformatica.isSelected()) {
                    resposta.append("\n- Informática");
                }
                JOptionPane.showMessageDialog(null, resposta.toString());
            }
        });
    }

}
