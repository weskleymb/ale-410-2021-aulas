package br.senac.rn.exercicios;

/*
Classe br.senac.rn.exercicios.Retangulo: Crie uma classe que modele um retangulo:

Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher)
Métodos: Mudar valor dos lados,
        Retornar valor dos lados,
        calcular Área e
        calcular Perímetro;

        Crie um programa que utilize esta classe.
        Ele deve pedir ao usuário que informe as medidas de um local.

        Depois, deve criar um objeto com as medidas e calcular a
        quantidade de pisos e de rodapés necessárias para o local.
 */

public class Retangulo {

    // atributos
    private Double base;
    private Double altura;

    // construtor
    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    // metodos (set) (mudar ou trocar)
    public void setBase(Double base) {
        this.base = base;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    // metodos (get) (obter ou retornar)
    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getArea() {
        Double area = base * altura;
        return area;
    }

    public Double getPerimetro() {
        Double perimetro = (base + altura) * 2;
        return perimetro;
    }

}
