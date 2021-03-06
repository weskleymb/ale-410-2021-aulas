package br.senac.rn.exercicios;

/*
Classe br.senac.rn.exercicios.Pessoa: Crie uma classe que modele uma pessoa:

Atributos: nome, idade, peso e altura
Métodos: Envelhercer,
        engordar,
        emagrecer,
        crescer.
        Obs: Por padrão, a cada ano que nossa
        pessoa envelhece, sendo a idade dela
        menor que 21 anos, ela deve crescer 0,5 cm.
 */

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pessoa {

    // atributos
    @Id
    private String nome;
    private Integer idade;
    private Double peso;
    private Double altura;

    // construtor
    public Pessoa(String nome, Integer idade, Double peso, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa() {

    }

    // metodos
    public void crescer() {
        if (idade <= 21) {
            altura += 0.5;
        }
    }

    public void envelhecer() {
        idade++;
        crescer();
    }

    public void engordar() {
        peso++;
    }

    public void emagrecer() {
        peso -= 0.5;
    }

    @Override
    public String toString() {
        return "br.senac.rn.exercicios.Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

}
