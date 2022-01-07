public class Questao03 {

    /*
    Faça um Programa que leia 4 notas,
    mostre as notas e a média na tela.
     */

    public static void main(String[] args) {

        Double notas[] = {7.5, 8.5, 4.5, 7.5, 8.0};

        Double soma = 0.0;
        for (Double nota : notas) {
            soma += nota;
        }

        Double media = soma / notas.length;

        for (Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("Media: " + media);

    }

}
