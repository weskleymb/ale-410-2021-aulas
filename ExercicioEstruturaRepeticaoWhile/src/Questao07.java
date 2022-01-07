import java.util.Scanner;

public class Questao07 {

    /*
    Faça um programa que leia 5 números
    e informe o maior número.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer maior = 0, i = 1;

        do {
            System.out.println("Informe o " + i + "º número");
            Integer numero = scanner.nextInt();
            if (i == 1 || numero > maior) {
                maior = numero;
            }
            i++;
        } while (i <= 5);

        System.out.println("O maior é " + maior);

    }
}
