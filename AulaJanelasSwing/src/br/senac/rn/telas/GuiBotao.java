package br.senac.rn.telas;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GuiBotao extends JPanel {

    private JButton botaoMensagem, botaoTeimoso;

    public GuiBotao() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);

        botaoMensagem = new JButton("Mensagem");
        botaoTeimoso = new JButton("Teimoso");

        botaoMensagem.setBounds(50, 20, 140, 38);
        botaoTeimoso.setBounds(50, 70, 100, 25);

        add(botaoMensagem);
        add(botaoTeimoso);
    }

    private void definirEventos() {
        botaoMensagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botão Mensagem");
            }
        });
        botaoTeimoso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botão Teimoso");
            }
        });
        botaoTeimoso.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                botaoTeimoso.setBounds(50, 120, 100, 25);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                botaoTeimoso.setBounds(50, 70, 100, 25);
            }
        });
    }

}
