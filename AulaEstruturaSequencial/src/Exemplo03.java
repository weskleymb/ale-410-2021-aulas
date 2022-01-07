import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String usuario = entrada.nextLine();

        System.out.println("Bem vindo " + usuario);

    }

}
