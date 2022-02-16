package br.senac.rn.agenda.dao;

import br.senac.rn.agenda.dominio.Contato;
import br.senac.rn.agenda.dominio.TipoDeTelefone;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TipoDeTelefoneRepositorio implements Repositorio<TipoDeTelefone, Integer> {

    private ConexaoDB conexao;

    public TipoDeTelefoneRepositorio() {
        conexao = new ConexaoDB();
    }

    @Override
    public void save(TipoDeTelefone tipoDeTelefone) {

    }

    @Override
    public Boolean delete(TipoDeTelefone tipoDeTelefone) {
        return deleteByPK(tipoDeTelefone.getId());
    }

    @Override
    public Boolean deleteByPK(Integer id) {
        String sql = "delete from tb_tipos_fones where tip_id = ?";
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
    public List<TipoDeTelefone> selectAll() {
        return null;
    }

    @Override
    public TipoDeTelefone selectByPK(Integer id) {
        String sql = "select * from tb_tipos_fones where tip_id = ?";
        try {
            TipoDeTelefone tipoDeTelefone = new TipoDeTelefone();
            PreparedStatement statement = conexao.abrir().prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                tipoDeTelefone.setId(resultSet.getInt("tip_id"));
                tipoDeTelefone.setNome(resultSet.getString("tip_nome"));
            }
            resultSet.close();
            statement.close();
            return tipoDeTelefone;
        } catch (SQLException | NullPointerException erro) {
            System.out.println(erro.getMessage());
        }
        return null;
    }
}
