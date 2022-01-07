import java.util.ArrayList;
import java.util.List;

public class Questao01 {

    /*
    Faça um Programa que leia um vetor
    de 5 números inteiros e mostre-os.
     */

    public static void main(String[] args) {

        Integer numeros[] = {2, 4, 6, 8, 2};

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        for (Integer iterador = 0; iterador < numeros.length; iterador++) {
            System.out.println(numeros[iterador]);
        }

    }

}
