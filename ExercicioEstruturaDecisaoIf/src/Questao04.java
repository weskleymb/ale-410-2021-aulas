import java.util.Scanner;

public class Questao04 {

    /*
    Faça um Programa que verifique se uma
    letra digitada é vogal ou consoante.

    vogal (a, e, i, o, u)
    consoante (é o resto)
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma letra:");
        String letra = entrada.nextLine();

        Boolean ehVogalA = letra.equalsIgnoreCase("a");
        Boolean ehVogalE = letra.equalsIgnoreCase("e");
        Boolean ehVogalI = letra.equalsIgnoreCase("i");
        Boolean ehVogalO = letra.equalsIgnoreCase("o");
        Boolean ehVogalU = letra.equalsIgnoreCase("u");

        if (ehVogalA || ehVogalE || ehVogalI || ehVogalO || ehVogalU) {
            System.out.println("VOGAL");
        } else {
            System.out.println("CONSOANTE");
        }

    }

}
