package br.senac.rn.telas;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiBotaoOpcao extends JPanel {

    private JRadioButton opcaoMasculino, opcaoFeminino;
    private ButtonGroup grupoOpcoes;
    private JButton botaoVerificar;
    private JLabel rotuloSexo;

    public GuiBotaoOpcao() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);

        opcaoMasculino = new JRadioButton("Masculino");
        opcaoFeminino = new JRadioButton("Feminino");

        opcaoMasculino.setBounds(55, 45, 100, 25);
        opcaoFeminino.setBounds(55, 70, 100, 25);

        grupoOpcoes = new ButtonGroup();

        grupoOpcoes.add(opcaoMasculino);
        grupoOpcoes.add(opcaoFeminino);

        opcaoFeminino.setSelected(true);

        add(opcaoMasculino);
        add(opcaoFeminino);

        botaoVerificar = new JButton("Verificar");
        botaoVerificar.setBounds(55, 105, 100, 20);
        add(botaoVerificar);

        rotuloSexo = new JLabel("Selecione o sexo:");
        rotuloSexo.setBounds(55, 10, 105, 30);
        add(rotuloSexo);
    }

    private void definirEventos() {
        botaoVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder resposta = new StringBuilder();
                resposta.append("Selecionados:");
                if (opcaoMasculino.isSelected()) {
                    resposta.append("\n- Masculino");
                }
                if (opcaoFeminino.isSelected()) {
                    resposta.append("\n- Feminino");
                }
                JOptionPane.showMessageDialog(null, resposta.toString());
            }
        });
    }

}
