import java.util.Scanner;

public class Questao09 {

    /*
    Faça um Programa que leia três números
    e mostre-os em ordem decrescente.
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Valor 1:");
        Integer valor1 = entrada.nextInt();

        System.out.println("Valor 2:");
        Integer valor2 = entrada.nextInt();

        System.out.println("Valor 3:");
        Integer valor3 = entrada.nextInt();

        Integer auxiliar = 0;

        if (valor1 > valor2) {
            auxiliar = valor1;
            valor1 = valor2;
            valor2 = auxiliar;
        }

        if (valor2 > valor3) {
            auxiliar = valor2;
            valor2 = valor3;
            valor3 = auxiliar;
        }

        if (valor1 > valor2) {
            auxiliar = valor1;
            valor1 = valor2;
            valor2 = auxiliar;
        }

        System.out.println(valor1 + "<" + valor2 + "<" + valor3);

    }

}
