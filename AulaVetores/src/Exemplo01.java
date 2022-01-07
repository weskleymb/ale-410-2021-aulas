import java.util.Scanner;

public class Exemplo01 {

    /*
    Faça um programa que receba 04 notas
    e imprima a media
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double soma = 0.0;

        Double notas[] = new Double[4];

        for (Integer i = 0; i < 4; i++) {
            System.out.println("Nota " + i);
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        Double media = soma / 4;

        System.out.println("Media: " + media);

    }

}
