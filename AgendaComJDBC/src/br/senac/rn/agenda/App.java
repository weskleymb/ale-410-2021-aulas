package br.senac.rn.agenda;

import br.senac.rn.agenda.dominio.Contato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

    private static final String URL = "jdbc:postgresql://localhost/agenda_jdbc";
    private static final String USUARIO = "agenda";
    private static final String SENHA = "agenda";

    public static void main(String[] args) throws SQLException {
        System.out.println("Minha agenda");

        Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);

        String sql = "select * from tb_contatos";

        PreparedStatement statement = conexao.prepareStatement(sql);

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            Integer id = resultSet.getInt("con_id");
            String nome = resultSet.getString("con_nome");
            String fone = resultSet.getString("con_fone");
            Contato contato = new Contato(id, nome, fone);
            System.out.println(contato);
        }

        resultSet.close();

        statement.close();

        conexao.close();
    }

}
