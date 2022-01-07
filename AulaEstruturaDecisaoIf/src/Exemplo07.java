import java.util.Scanner;

public class Exemplo07 {

    /*
    solicitar do usuario 04 notas e
    realizar o calculo da média destas 04 notas e em seguida
    informar se o aluno está aprovado, reprovado ou em recuperação
    (media ser maior ou igual a 7.0 estará aprovado por media)
    (media ser menor que 3.0 estará reprovado por media)
    (media ser entre 3.0 e 7.0 estará em recuperação)
    se em recuperação calcular a nova media e informar se
    aprovado na recuperação ou reprovado na recuperação
    (media da recuperação maior ou igual a 5.0 estará aprovado)
    (media da recuperação menor do que 5.0 estará reprovado)
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        Double nota1 = entrada.nextDouble();

        System.out.println("Digite a nota 2:");
        Double nota2 = entrada.nextDouble();

        System.out.println("Digite a nota 3:");
        Double nota3 = entrada.nextDouble();

        System.out.println("Digite a nota 4:");
        Double nota4 = entrada.nextDouble();

        Double mediaAnual = (nota1 + nota2 + nota3 + nota4) / 4;

        Boolean aprovadoPorMedia = mediaAnual >= 7.0;
        Boolean reprovadoPorMedia = mediaAnual < 3.0;

        if (reprovadoPorMedia) {
            System.out.println("REPROVADO POR MÉDIA / MÉDIA = " + mediaAnual);
        } else if (aprovadoPorMedia) {
            System.out.println("APROVADO POR MÉDIA / MÉDIA = " + mediaAnual);
        } else {
            System.out.println("Digite a nota da recuperação:");
            Double notaRecuperacao = entrada.nextDouble();
            Double mediaRecuperacao = (mediaAnual + notaRecuperacao) / 2;
            Boolean aprovadoNaRecuperacao = mediaRecuperacao >= 5.0;
            if (aprovadoNaRecuperacao) {
                System.out.println("APROVADO NA RECUPERAÇÃO / MÉDIA = " + mediaRecuperacao);
            } else {
                System.out.println("REPROVADO NA RECUPERAÇÃO / MÉDIA = " + mediaRecuperacao);
            }
        }

    }

}
