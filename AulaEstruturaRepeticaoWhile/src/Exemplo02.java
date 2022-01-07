import java.util.Scanner;

public class Exemplo02 {

    /*
    faça um programa que pergunte
    ao usuario se ele é bonito e
    encerre apenas quando a resposta
    for "sim"
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String resposta = "";

        do {
            System.out.println("Eu sou bonito?");
            resposta = scanner.nextLine();
        } while (!resposta.equalsIgnoreCase("sim"));

        System.out.println("Parabens você é um ser inteligente!");

    }

}
