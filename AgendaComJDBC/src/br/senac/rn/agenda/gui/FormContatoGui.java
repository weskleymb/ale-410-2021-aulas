package br.senac.rn.agenda.gui;

import br.senac.rn.agenda.dao.ContatoRepositorio;
import br.senac.rn.agenda.dominio.Contato;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;
import java.util.List;

public class FormContatoGui extends JFrame {

    private JLabel rotuloNome, rotuloFone;
    private JTextField campoNome;
    private JFormattedTextField campoFone;
    private JButton botaoSalvar;
    private ImageIcon imagemSalvar, imagemContato;
    private Contato contato;
    private DefaultTableModel modelo;
    private MaskFormatter mascaraFone;

    public FormContatoGui(Contato contato, DefaultTableModel modelo) {
        this.contato = contato;
        this.modelo = modelo;
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
        campoNome.setText(contato.getNome());
        add(campoNome);

        try {
            mascaraFone = new MaskFormatter("(##) ####-####");
        } catch (ParseException erro) {
            System.out.println(erro.getMessage());
        }

        campoFone = new JFormattedTextField(mascaraFone);
        campoFone.setBounds(170, 35, 130, 32);
        campoFone.setText(contato.getFone());
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
                ContatoRepositorio repositorio = new ContatoRepositorio();
                contato.setNome(campoNome.getText());
                contato.setFone(campoFone.getText());
                repositorio.save(contato);
                atualizarTabelaContatos();
                setVisible(false);
            }
        });
        campoFone.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {
                String fone = limparCampoFone(campoFone.getText());
                try {
                    if (fone.charAt(2) == '9') {
                        mascaraFone = new MaskFormatter("(##) # ####-####");
                    } else {
                        mascaraFone = new MaskFormatter("(##) ####-####");
                    }
                } catch (ParseException ignored) {}
                campoFone.setFormatterFactory(new DefaultFormatterFactory(mascaraFone));
                campoFone.setText(fone);
            }
        });
    }

    private String limparCampoFone(String text) {
        return text.replace("(", "").replace(")", "").replace("-", "").replace(" ", "").trim();
    }

    private void atualizarTabelaContatos() {
        List<Contato> contatos = new ContatoRepositorio().selectAll();
        modelo.setRowCount(0);
        for (Contato contato : contatos) {
            Object linha[] = {contato.getId(), contato.getNome(), contato.getFone()};
            modelo.addRow(linha);
        }
    }

    private void limparFormulario() {
        campoNome.setText("");
        campoNome.requestFocus();
        campoFone.setText("");
    }

    public void abrir() {
        FormContatoGui janela = new FormContatoGui(contato, modelo);
//        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        Integer eixoX = (resolucao.width - janela.getSize().width) / 2;
        Integer eixoY = (resolucao.height - janela.getSize().height) / 2;
        janela.setLocation(eixoX, eixoY);
        janela.setVisible(true);
    }

}
