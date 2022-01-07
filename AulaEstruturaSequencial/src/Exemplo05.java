import java.util.Scanner;

public class Exemplo05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um texto:");
        String texto = entrada.nextLine();

        Boolean logico = false; // não existe solicitação deste valor

        System.out.println("Digite um número inteiro:");
        Integer inteiro = entrada.nextInt();

        System.out.println("Digite um número real:");
        Double real = entrada.nextDouble();

    }

}
