import java.util.Scanner;

public class Exemplo03 {

    /*
    Informe se um número é primo / ou não

    Dica: um número é tido como primo quando ele
          é divisível por 01 e por ele mesmo apenas
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer numero = scanner.nextInt();

        Integer quantidadeDivisoes = 0;

        Integer contador = 1;

        while(numero > 1) {

            if (numero % contador == 0) {
                quantidadeDivisoes++;
            }

            if (numero == contador) {
                break;
            }

            contador++;

        }

        System.out.println("Quantidade de Divisões: " + quantidadeDivisoes);

        if (quantidadeDivisoes == 2) {
            System.out.println("É PRIMO");
        } else {
            System.out.println("NÃO É PRIMO");
        }

    }

}
