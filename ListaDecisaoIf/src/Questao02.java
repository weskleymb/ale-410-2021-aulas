import java.util.Scanner;

public class Questao02 {

    /*
    Faça um Programa que peça um valor e mostre
    na tela se o valor é positivo ou negativo.
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // solicitação do número
        System.out.println("Informe um número:");
        Integer numero = entrada.nextInt();

        String resultado = "NEGATIVO";

        Boolean positivo = numero >= 0;

        if (positivo) {
            resultado = "POSITIVO";
        }

        System.out.println(resultado);

    }

}
