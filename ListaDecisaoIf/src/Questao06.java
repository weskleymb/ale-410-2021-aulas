import java.util.Scanner;

public class Questao06 {

    /* 06 / 07 / 09
    Faça um Programa que leia
    três números e mostre o maior deles.
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        Double valor1 = entrada.nextDouble(); // tem que ser sempre o menor de todos

        System.out.println("Informe o segundo número:");
        Double valor2 = entrada.nextDouble(); // tem que ser sempre o valor do meio

        System.out.println("Informe o terceiro número:");
        Double valor3 = entrada.nextDouble(); // tem que ser sempre o maior de todos

        Double auxiliar = 0.0;

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
