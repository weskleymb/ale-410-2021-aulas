package br.senac.rn.telas;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GuiListaOpcoes extends JPanel {

    private JComboBox listaEstados;
    private JLabel rotuloEstados;
    private JButton botaoMostrar;

    public GuiListaOpcoes() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);

        String estados[] = {
                "Maranhão",
                "Piauí",
                "Ceará",
                "Rio Grande do Norte",
                "Paraíba",
                "Pernambuco",
                "Alagoas",
                "Sergipe",
                "Bahia"
        };

        listaEstados = new JComboBox(estados);
        listaEstados.setBounds(25, 40, 150, 25);
        add(listaEstados);

        rotuloEstados = new JLabel("Estados do Nordeste:");
        rotuloEstados.setBounds(25, 15, 150, 25);
        add(rotuloEstados);

        botaoMostrar = new JButton("Mostrar");
        botaoMostrar.setBounds(25, 75, 100, 25);
        add(botaoMostrar);
    }

    private void definirEventos() {
        botaoMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String itemSelecionado = listaEstados.getSelectedItem().toString();
                JOptionPane.showMessageDialog(null, itemSelecionado);
            }
        });
    }

}
