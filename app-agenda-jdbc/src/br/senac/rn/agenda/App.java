package br.senac.rn.agenda;

import br.senac.rn.agenda.model.Pessoa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/agenda_test", "agenda", "agenda");

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM pessoa p");

        ResultSet resultSet = preparedStatement.executeQuery();

        Pessoa pessoa = new Pessoa();
        if (resultSet.first()) {
            pessoa.id = resultSet.getInt("id");
            pessoa.nome = resultSet.getString("nome");
        }



//        while (resultSet.next()) {
//        }

        System.out.println(pessoa);

        connection.close();

    }

}
