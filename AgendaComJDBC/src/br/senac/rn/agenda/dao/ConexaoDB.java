package br.senac.rn.agenda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    private final String URL = "jdbc:postgresql://localhost/agenda_jdbc";
    private final String USUARIO = "agenda";
    private final String SENHA = "agenda";

    private Connection conexao;

    public ConexaoDB() {
        try {
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException erro) {
            conexao = null;
            System.out.println(erro.getMessage());
        }
    }

    public Connection abrir() {
        return conexao;
    }

    public Boolean fechar() {
        try {
            conexao.close();
            return true;
        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
        }
        return false;
    }

}
