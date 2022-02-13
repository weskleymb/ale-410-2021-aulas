package br.senac.rn.agenda;

import br.senac.rn.agenda.model.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
        EntityManager manager = factory.createEntityManager();

        System.out.println(manager.find(Pessoa.class, 1));

    }

}
