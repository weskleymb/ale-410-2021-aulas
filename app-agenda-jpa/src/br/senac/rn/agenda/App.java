package br.senac.rn.agenda;

import br.senac.rn.agenda.model.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("AgendaPU");
        EntityManager manager = factory.createEntityManager();

        System.out.println(manager.find(Pessoa.class, 1));

    }

}
