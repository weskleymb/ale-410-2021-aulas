public class Questao02 {

    /*
    Faça um Programa que leia um vetor de
    10 números reais e mostre-os na ordem inversa.
     */

    public static void main(String[] args) {

        Double numerosReais[] = {
                12.0,
                -3.0,
                -100.0,
                50.0,
                45.3,
                67.7,
                200.0,
                2.0,
                512.3,
                1.0
        };

        for (Integer iterador =  numerosReais.length - 1;
             iterador >= 0;
             iterador--) {

            System.out.println(numerosReais[iterador]);

        }

    }

}
