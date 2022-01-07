public class Exemplo06 {

    /*
    imprimir todos os numeros ímpares
    de 1 até 100
     */

    public static void main(String[] args) {

//        for (Integer i = 1; i <= 100; i += 2) {
//            System.out.println(i);
//        }

        for (Integer i = 1; i <= 100; i++) {
            // verifica se o resto da divisão é 1
            Boolean ehImpar = i % 2 == 1;
            if (ehImpar) {
                System.out.println(i);
            }
        }

    }

}
