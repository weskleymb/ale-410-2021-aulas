package br.senac.rn.exercicios;

/*
Classe br.senac.rn.exercicios.Bola: Crie uma classe que modele uma bola:

Atributos: Cor, circunferência, material
Métodos: trocaCor e mostraCor
 */

public class Bola {

    // atributos
    private String cor = "branca";
    private Double circunferencia;
    private String material;

    // metodos
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
