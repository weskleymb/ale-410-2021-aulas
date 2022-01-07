/*
Classe Quadrado: Crie uma classe que modele um quadrado:

Atributos: Tamanho do lado
Métodos: Mudar valor do Lado,
        Retornar valor do Lado e
        calcular Área;
 */

public class Quadrado {

    // atributos
    private Double lado;

    // construtores
    public Quadrado(Double lado) {
        this.lado = lado;
    }

    // metodos
    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public Double getArea() {
        Double area = lado * lado;
        return area;
    }

}
