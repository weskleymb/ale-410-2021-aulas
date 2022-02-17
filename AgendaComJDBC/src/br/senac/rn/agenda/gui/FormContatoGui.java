package br.senac.rn.agenda.gui;

import br.senac.rn.agenda.dao.ContatoRepositorio;
import br.senac.rn.agenda.dominio.Contato;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormContatoGui extends JFrame {

    private JLabel rotuloNome, rotuloFone;
    private JTextField campoNome, campoFone;
    private JButton botaoSalvar;
    private ImageIcon imagemSalvar, imagemContato;

    public FormContatoGui() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        setResizable(false);
        setBounds(0, 0, 380, 120);

        imagemContato = new ImageIcon("icones/contatos.png");
        setIconImage(imagemContato.getImage());

        rotuloNome = new JLabel("Nome:");
        rotuloNome.setBounds(10, 10, 80, 25);
        add(rotuloNome);

        rotuloFone = new JLabel("Fone:");
        rotuloFone.setBounds(170, 10, 80, 25);
        add(rotuloFone);

        campoNome = new JTextField();
        campoNome.setBounds(10, 35, 150, 32);
        add(campoNome);

        campoFone = new JTextField();
        campoFone.setBounds(170, 35, 130, 32);
        add(campoFone);

        imagemSalvar = new ImageIcon("icones/save.png");

        botaoSalvar = new JButton(imagemSalvar);
        botaoSalvar.setBounds(320, 35, 32, 32);
        botaoSalvar.setBackground(new Color(238, 238, 238));
        botaoSalvar.setBorder(null);
        add(botaoSalvar);
    }

    private void definirEventos() {
        botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                String fone = campoFone.getText();
                Contato contato = new Contato(nome, fone);
                ContatoRepositorio repositorio = new ContatoRepositorio();
                repositorio.save(contato);
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                limparFormulario();
            }
        });
    }

    private void limparFormulario() {
        campoNome.setText("");
        campoNome.requestFocus();
        campoFone.setText("");
    }

    public void abrir() {
        FormContatoGui janela = new FormContatoGui();
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        Integer eixoX = (resolucao.width - janela.getSize().width) / 2;
        Integer eixoY = (resolucao.height - janela.getSize().height) / 2;
        janela.setLocation(eixoX, eixoY);
        janela.setVisible(true);
    }

}
