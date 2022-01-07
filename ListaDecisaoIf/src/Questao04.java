import java.util.Scanner;

public class Questao04 {

    /*
    Faça um Programa que verifique se uma
    letra digitada é vogal (a, e, i, o, u)
    o resto é consoante.
     */

    // programamos aqui dentro
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe uma letra do alfabeto:");
        String letraDigitada = entrada.next();

        if (letraDigitada.equalsIgnoreCase("a")
                || letraDigitada.equalsIgnoreCase("e")
                || letraDigitada.equalsIgnoreCase("i")
                || letraDigitada.equalsIgnoreCase("o")
                || letraDigitada.equalsIgnoreCase("u")) {
            System.out.println("É uma VOGAL");
        } else {
            System.out.println("É uma CONSOANTE");
        }

        // || => ou lógico
        // && => e lógico

    }

}
