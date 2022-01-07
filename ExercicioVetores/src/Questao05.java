import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer numeros[] = new Integer[20];

        for (Integer i = 0; i < numeros.length; i++) {
            System.out.println("Numero " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        Integer quantidadeDePares = 0;
        Integer quantidadeDeImpares = 0;

        for (Integer i = 0; i < numeros.length; i++) {
            Boolean ehPar = numeros[i] % 2 == 0;
            if (ehPar) {
                quantidadeDePares++;
            } else {
                quantidadeDeImpares++;
            }
        }

        Integer pares[] = new Integer[quantidadeDePares];
        Integer impares[] = new Integer[quantidadeDeImpares];

        Integer indicePar = 0;
        Integer indiceImpar = 0;

        for (Integer i = 0; i < numeros.length; i++) {
            Boolean ehPar = numeros[i] % 2 == 0;
            if (ehPar) {
                pares[indicePar] = numeros[i];
                indicePar++;
            } else {
                impares[indiceImpar] = numeros[i];
                indiceImpar++;
            }
        }

        for (Integer numero : pares) {
            System.out.println(numero);
        }

        System.out.println("====================");

        for (Integer numero : impares) {
            System.out.println(numero);
        }

        System.out.println("====================");

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

    }

}
