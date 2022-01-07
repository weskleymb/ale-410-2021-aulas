import java.util.Scanner;

public class Exemplo07 {

    /*
    Fazer um programa que mostre a tabuada do
    número informado
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a tabuada desejada:");
        Integer tabuada = entrada.nextInt();

        for (Integer contador = 1; contador <= 10; contador++) {
            Integer resultado = tabuada * contador;
            System.out.println(tabuada + " x " + contador + " = " + resultado);
        }

    }

}
