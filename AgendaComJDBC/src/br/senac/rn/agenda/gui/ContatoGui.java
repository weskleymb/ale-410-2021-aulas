package br.senac.rn.agenda.gui;

import br.senac.rn.agenda.dao.ContatoRepositorio;
import br.senac.rn.agenda.dominio.Contato;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ContatoGui extends JFrame {

    private JButton botaoNovo, botaoEditar, botaoRemover;
    private JTextField campoPesquisar;
    private ImageIcon imagemNovo, imagemEditar, imagemRemover, imagemContato;
    private JTable tabelaContatos;
    private JScrollPane barraRolagem;
    private DefaultTableModel formatoDaTabela;

    public ContatoGui() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        setTitle("Agenda");
        setResizable(false);
        setBounds(0, 0, 400, 400);

        imagemContato = new ImageIcon("icones/contatos.png");
        setIconImage(imagemContato.getImage());

        imagemNovo = new ImageIcon("icones/add.png");

        botaoNovo = new JButton(imagemNovo);
        botaoNovo.setBounds(250, 10, 32, 32);
        botaoNovo.setBackground(new Color(238, 238, 238));
        botaoNovo.setBorder(null);
        add(botaoNovo);

        imagemEditar = new ImageIcon("icones/edit.png");

        botaoEditar = new JButton(imagemEditar);
        botaoEditar.setBounds(300, 10, 32, 32);
        botaoEditar.setBackground(new Color(238, 238, 238));
        botaoEditar.setBorder(null);
        add(botaoEditar);

        imagemRemover = new ImageIcon("icones/del.png");

        botaoRemover = new JButton(imagemRemover);
        botaoRemover.setBounds(350, 10, 32, 32);
        botaoRemover.setBackground(new Color(238, 238, 238));
        botaoRemover.setBorder(null);
        add(botaoRemover);

        campoPesquisar = new JTextField();
        campoPesquisar.setBounds(10, 10, 200, 32);
        campoPesquisar.requestFocus();
        add(campoPesquisar);

        inicializarTabela();
    }

    private void inicializarTabela() {
        Object cabecalho[] = {"ID", "NOME", "FONE"};
        formatoDaTabela = new DefaultTableModel(cabecalho, 0);

        carregarTodosContatos();

        DefaultTableCellRenderer alinharDireita = new DefaultTableCellRenderer();
        alinharDireita.setHorizontalAlignment(SwingConstants.RIGHT);

        DefaultTableCellRenderer alinharCentro = new DefaultTableCellRenderer();
        alinharCentro.setHorizontalAlignment(SwingConstants.CENTER);

        tabelaContatos = new JTable(formatoDaTabela);

        tabelaContatos.getColumnModel().getColumn(0).setPreferredWidth(10);
        tabelaContatos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabelaContatos.getColumnModel().getColumn(2).setPreferredWidth(150);

        tabelaContatos.getColumnModel().getColumn(0).setCellRenderer(alinharCentro);
        tabelaContatos.getColumnModel().getColumn(2).setCellRenderer(alinharDireita);

        barraRolagem = new JScrollPane(tabelaContatos);
        barraRolagem.setBounds(10, 70, 365, 280);
        add(barraRolagem);
    }

    private void carregarTodosContatos() {
        List<Contato> contatos = new ContatoRepositorio().selectAll();
        for (Contato contato : contatos) {
            Object linha[] = {contato.getId(), contato.getNome(), contato.getFone()};
            formatoDaTabela.addRow(linha);
        }
    }

    private void definirEventos() {
        botaoNovo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormContatoGui formulario = new FormContatoGui();
                formulario.abrir();
            }
        });
    }

    public static void abrir() {
        ContatoGui janela = new ContatoGui();
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        Integer eixoX = (resolucao.width - janela.getSize().width) / 2;
        Integer eixoY = (resolucao.height - janela.getSize().height) / 2;
        janela.setLocation(eixoX, eixoY);
        janela.setVisible(true);
    }

}
