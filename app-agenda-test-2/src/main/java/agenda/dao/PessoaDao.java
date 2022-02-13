package main.java.agenda.dao;

import main.java.agenda.model.Pessoa;

import javax.persistence.EntityManager;

public class PessoaDao {

    private EntityManager manager;

    public PessoaDao() {
        manager = ConexaoDB.getInstance().getEntityManager();
    }

    public Pessoa selectById(Integer id) {
        return manager.find(Pessoa.class, id);
    }

}
