package main.java.agenda.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexaoDB {

    private static ConexaoDB singleton = new ConexaoDB();
    private static EntityManager manager;

    private ConexaoDB() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ConexaoDB");
        manager = factory.createEntityManager();
    }

    public static ConexaoDB getInstance() {
        return singleton;
    }

    public EntityManager getEntityManager() {
        return manager;
    }

}
