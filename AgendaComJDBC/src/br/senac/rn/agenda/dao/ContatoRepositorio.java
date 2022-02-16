package br.senac.rn.agenda.dao;

import br.senac.rn.agenda.dominio.Contato;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoRepositorio implements Repositorio<Contato, Integer> {

    private ConexaoDB conexao;

    public ContatoRepositorio() {
        conexao = new ConexaoDB();
    }

    @Override
    public void save(Contato contato) {
        if (selectByPK(contato.getId()) == null) {
            insert(contato);
        } else {
            update(contato);
        }
    }

    private Boolean insert(Contato contato) {
        String sql = "insert into tb_contatos (con_nome, con_fone) values (?, ?)";
        try {
            PreparedStatement statement = conexao.abrir().prepareStatement(sql);
            statement.setString(1, contato.getNome());
            statement.setString(2, contato.getFone());
            statement.execute();
            return true;
        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
        }
        return false;
    }

    private Boolean update(Contato contato) {
        String sql = "UPDATE tb_contatos SET con_nome = ?, con_fone = ? WHERE con_id = ?";
        try {
            PreparedStatement statement = conexao.abrir().prepareStatement(sql);
            statement.setString(1, contato.getNome());
            statement.setString(2, contato.getFone());
            statement.setInt(3, contato.getId());
            statement.execute();
            return true;
        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
        }
        return false;
    }

    @Override
    public Boolean delete(Contato contato) {
        return deleteByPK(contato.getId());
    }

    @Override
    public Boolean deleteByPK(Integer id) {
        String sql = "delete from tb_contatos where con_id = ?";
        try {
            PreparedStatement statement = conexao.abrir().prepareStatement(sql);
            statement.setInt(1, id);
            statement.execute();
            return true;
        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
        }
        return false;
    }

    @Override
    public List<Contato> selectAll() {
        List<Contato> contatos = new ArrayList<>();
        String sql = "select * from tb_contatos";
        try {
            PreparedStatement statement = conexao.abrir().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("con_id");
                String nome = resultSet.getString("con_nome");
                String fone = resultSet.getString("con_fone");
                Contato contato = new Contato(id, nome, fone);
                contatos.add(contato);
            }
            resultSet.close();
            statement.close();
            return contatos;
        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
        }
        return null;
    }

    @Override
    public Contato selectByPK(Integer id) {
        String sql = "select * from tb_contatos where con_id = ?";
        try {
            Contato contato = new Contato();
            PreparedStatement statement = conexao.abrir().prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                contato.setId(resultSet.getInt("con_id"));
                contato.setNome(resultSet.getString("con_nome"));
                contato.setFone(resultSet.getString("con_fone"));
            }
            resultSet.close();
            statement.close();
            return contato;
        } catch (SQLException | NullPointerException erro) {
            System.out.println(erro.getMessage());
        }
        return null;
    }

}
