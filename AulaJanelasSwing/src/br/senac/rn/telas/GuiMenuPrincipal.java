package br.senac.rn.telas;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiMenuPrincipal extends JFrame {

    private Container painelDeConteudo;
    private JMenuBar barraDeMenu;
    private JMenu menuArquivo, menuExemplos;
    private JMenuItem itemSair, itemBotao;

    public GuiMenuPrincipal() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Menu Principal");
        setBounds(0, 0, 800, 600);

        painelDeConteudo = getContentPane();

        barraDeMenu = new JMenuBar();

        menuArquivo = new JMenu("Arquivo");

        itemSair = new JMenuItem("Sair");

        menuArquivo.add(itemSair);

        barraDeMenu.add(menuArquivo);

        menuExemplos = new JMenu("Exemplos");

        itemBotao = new JMenuItem("Botão");

        menuExemplos.add(itemBotao);

        barraDeMenu.add(menuExemplos);

        setJMenuBar(barraDeMenu);
    }

    private void definirEventos() {
        itemSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void abrir() {
        GuiMenuPrincipal janela = new GuiMenuPrincipal();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();

        Integer pontoX = (tela.width - janela.getSize().width) / 2;
        Integer pontoY = (tela.height - janela.getSize().height) / 2;

        janela.setLocation(pontoX, pontoY);

        janela.setVisible(true);
    }

}
