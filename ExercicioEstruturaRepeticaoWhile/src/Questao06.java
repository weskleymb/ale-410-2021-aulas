public class Questao06 {

    /*
    Faça um programa que imprima na tela
    os números de 1 a 20, um abaixo do outro.
    Depois modifique o programa para que
    ele mostre os números um ao lado do outro.
     */

    public static void main(String[] args) {

        Integer i = 1;

        String umAbaixoDoOutro = "";
        String ladoALado = "";

        while (i <= 20) {
            umAbaixoDoOutro += i + "\n"; // \n (quebra de linha)
            ladoALado += i + "\t";       // \t (tabulação)
            i++;
        }

        System.out.println(umAbaixoDoOutro);
        System.out.println(ladoALado);

    }

}
