import java.util.Scanner;

public class Exemplo05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double soma = 0.0;

        for (Integer iterador = 1; iterador <= 4; iterador++) {
            System.out.println("Digite a nota " + iterador);
            Double nota = scanner.nextDouble();

            soma += nota;
        }

        System.out.println(soma / 4);

    }

}
