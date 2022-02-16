package br.senac.rn.telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLogin extends JFrame {

    private static GuiLogin janela;

    private JLabel rotuloLogin;
    private JLabel rotuloSenha;
    private JButton botaoLogin;
    private JButton botaoCancelar;
    private JTextField campoLogin;
    private JPasswordField campoSenha;

    public GuiLogin() {
        this.inicializarComponentes();
        this.definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        setTitle("Login no Sistema"); // define o titulo da janela
        setBounds(0, 0, 300, 200);

        rotuloLogin = new JLabel("Login:");
        rotuloSenha = new JLabel("Senha:");
        campoLogin = new JTextField(10);
        campoSenha = new JPasswordField(20);
        botaoLogin = new JButton("Logar");
        botaoCancelar = new JButton("Cancelar");

        rotuloLogin.setBounds(30, 30, 80, 25);
        rotuloSenha.setBounds(30, 75, 80, 25);
        campoLogin.setBounds(100, 30, 120, 25);
        campoSenha.setBounds(100, 75, 120, 25);
        botaoLogin.setBounds(20, 120, 100, 25);
        botaoCancelar.setBounds(125, 120, 100, 25);

        add(rotuloLogin);
        add(rotuloSenha);
        add(campoLogin);
        add(campoSenha);
        add(botaoLogin);
        add(botaoCancelar);
    }

    private void definirEventos() {
        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = campoLogin.getText();
                String senha = String.valueOf(campoSenha.getPassword());

                if (login.equals("") && senha.equals("")) {
                    GuiMenuPrincipal.abrir();
                    janela.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Login e Senha CORRETOS",
                            "Passou",
                            JOptionPane.ERROR_MESSAGE
                    );
                    limparFormulario();
                }
            }
        });
        botaoCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparFormulario();
            }
        });
    }

    private void limparFormulario() {
        campoLogin.setText("");
        campoSenha.setText("");
        campoLogin.requestFocus();
    }

    public static void main(String[] args) {
        janela = new GuiLogin();

        // define que ao fechar a janela o programa encerra
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();

        Integer pontoX = (tela.width - janela.getSize().width) / 2;
        Integer pontoY = (tela.height - janela.getSize().height) / 2;

        janela.setLocation(pontoX, pontoY);

        janela.setVisible(true);
    }

}
