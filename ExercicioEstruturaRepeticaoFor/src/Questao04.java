public class Questao04 {

    /*
    Supondo que a população de um país A seja da ordem de
    80000 habitantes com uma taxa anual de crescimento
    de 3% e que a população de B seja
    200000 habitantes com uma taxa de crescimento de 1.5%.
    Faça um programa que calcule e escreva o número de anos
    necessários para que a população do país A ultrapasse
    ou iguale a população do país B, mantidas as taxas de crescimento.
     */

    public static void main(String[] args) {

        Double quantidadeA = 80000.0;
        Double quantidadeB = 200000.0;

        final Double TAXA_A = 3.0 / 100.0;
        final Double TAXA_B = 1.5 / 100.0;

        for (Integer quantidadeAnos = 1; quantidadeA <= quantidadeB; quantidadeAnos++) {
            System.out.println("Ano: " + quantidadeAnos);

            quantidadeA += quantidadeA * TAXA_A;
            System.out.println(quantidadeA);

            quantidadeB += quantidadeB * TAXA_B;
            System.out.println(quantidadeB);

            System.out.println("==================");
        }

    }

}
