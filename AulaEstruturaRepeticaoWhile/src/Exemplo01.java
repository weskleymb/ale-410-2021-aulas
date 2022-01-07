import java.util.Scanner;

public class Exemplo01 {

    /*
    faça um programa que pergunte
    ao usuario se ele é bonito e
    encerre apenas quando a resposta
    for "sim"
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Eu sou bonito?");
        String resposta = scanner.nextLine();

        while (!resposta.equalsIgnoreCase("sim")) {
            System.out.println("Eu sou bonito?");
            resposta = scanner.nextLine();
        }

    }

}
