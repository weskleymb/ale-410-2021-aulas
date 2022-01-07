public class Exemplo05 {

    /*
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

        Double mediaAnual = 10.0;

        Boolean aprovadoPorMedia = mediaAnual >= 7.0;
        Boolean reprovadoPorMedia = mediaAnual < 3.0;

        if (reprovadoPorMedia) {
            System.out.println("REPROVADO POR MÉDIA");
        } else if (aprovadoPorMedia) {
            System.out.println("APROVADO POR MÉDIA");
        } else {
            Double notaRecuperacao = 2.0;
            Double mediaRecuperacao = (mediaAnual + notaRecuperacao) / 2;
            Boolean aprovadoNaRecuperacao = mediaRecuperacao >= 5.0;
            if (aprovadoNaRecuperacao) {
                System.out.println("APROVADO NA RECUPERAÇÃO");
            } else {
                System.out.println("REPROVADO NA RECUPERAÇÃO");
            }
        }

    }

}
