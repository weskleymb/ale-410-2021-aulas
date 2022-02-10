package br.senac.rn.telas;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;

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
        setLayout(null);
        setTitle("Menu Principal");
        setBounds(0, 0, 800, 600);
    }

    private void definirEventos() {
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
