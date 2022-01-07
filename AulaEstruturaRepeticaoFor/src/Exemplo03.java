import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (Integer iterador = 1; iterador <= 4; iterador = iterador + 1) {
            System.out.println("Digite a nota " + iterador);
            Double nota = scanner.nextDouble();
        }

    }

}
