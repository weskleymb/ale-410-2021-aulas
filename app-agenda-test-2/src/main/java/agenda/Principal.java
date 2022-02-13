package main.java.agenda;

import main.java.agenda.dao.PessoaDao;
import main.java.agenda.model.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Rodando...");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ConexaoDB");
        EntityManager manager = factory.createEntityManager();
        manager.find(Pessoa.class, 2);
    }

}
