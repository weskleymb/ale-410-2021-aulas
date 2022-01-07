import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double soma = 0.0;

        for (Integer interador = 1; interador <= 4; interador = interador + 1) {
            System.out.println("Digite a nota " + interador);
            Double nota = scanner.nextDouble();

            soma = soma + nota;
        }

        System.out.println(soma / 4);

    }

}
