package br.senac.rn.agenda.dominio;

import java.util.Objects;

public class TipoDeTelefone {

    private Integer id;
    private String nome;

    public TipoDeTelefone() {}

    public TipoDeTelefone(String nome) {
        this.nome = nome;
    }

    public TipoDeTelefone(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoDeTelefone telefone = (TipoDeTelefone) o;
        return id.equals(telefone.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "TipoDeTelefone{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

}
