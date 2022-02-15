package br.senac.rn.agenda.dominio;

import java.util.Locale;
import java.util.Objects;

public class Contato {

    private Integer id;
    private String nome;
    private String fone;

    public Contato() {}

    public Contato(String nome, String fone) {
        setNome(nome);
        setFone(fone);
    }

    public Contato(Integer id, String nome, String fone) {
        this.id = id;
        setNome(nome);
        setFone(fone);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().toUpperCase();
    }

    public void setFone(String fone) {
        this.fone = fone.trim();
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return id.equals(contato.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", fone='" + fone + '\'' +
                '}';
    }

}
