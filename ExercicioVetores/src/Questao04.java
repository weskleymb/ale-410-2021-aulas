import java.util.Scanner;

public class Questao04 {

    /*
    Faça um Programa que leia um vetor de 10 caracteres,
    e diga quantas consoantes foram lidas. Imprima as consoantes.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String caracteres[] = new String[10];

        for (Integer i = 0; i < caracteres.length; i++) {
            System.out.println("Digite a letra " + i);
            caracteres[i] = scanner.next();
        }

        Integer quantidadeDeConsoantes = 0;

        for (String caractere : caracteres) {
            switch (caractere.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    break;
                default:
                    quantidadeDeConsoantes++;
            }
        }

        String consoantes[] = new String[quantidadeDeConsoantes];

        Integer c = 0;

        for (String caractere : caracteres) {
            switch (caractere.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    break;
                default:
                    consoantes[c] = caractere;
                    c++;
            }
        }

        for (String consoante : consoantes) {
            System.out.println(consoante);
        }

        System.out.println(quantidadeDeConsoantes);

    }

}
