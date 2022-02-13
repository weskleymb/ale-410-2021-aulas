package main.java.agenda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String nome;

}
