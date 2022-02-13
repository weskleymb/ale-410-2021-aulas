package br.senac.rn.agenda.model;

public class Pessoa {

    public Integer id;
    public String nome;

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
