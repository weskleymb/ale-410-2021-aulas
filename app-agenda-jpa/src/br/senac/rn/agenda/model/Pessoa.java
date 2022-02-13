package br.senac.rn.agenda.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pessoa {

    @Id
    public Integer id;
    public String nome;

}
