import java.util.Locale;
import java.util.Scanner;

public class Questao03 {

    /*
    Faça um Programa que verifique se
    uma letra digitada é "F" ou "M".
    Conforme a letra escrever: F - Feminino,
    M - Masculino, Sexo Inválido.

     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("M - Masculino");
        System.out.println("F - Feminino");
        System.out.println("Escolha um dos sexos acima:");
        String sexo = entrada.next();

        // toUpperCase transforma o texto em maiusculas
        // toLowerCase transforma o texto em minusculas
        // equals verifica se o texto é igual
        // equalsIgnoreCase verifica se o texto é igual desprezando maiusculas e minusculas
        Boolean masculino = sexo.equalsIgnoreCase("M");
        Boolean feminino = sexo.equalsIgnoreCase("F");

        if (masculino) {
            System.out.println("M - Masculino");
        } else if (feminino) {
            System.out.println("F - Feminino");
        } else {
            System.out.println("Sexo Inválido");
        }

    }

}
