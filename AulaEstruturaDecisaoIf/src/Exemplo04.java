public class Exemplo04 {

    /*
    informar se o aluno está aprovado, reprovado ou em recuperação
    (media ser maior ou igual a 7.0 estará aprovado)
    (media ser menor que 3.0 estará reprovado)
    (media ser entre 3.0 e 7.0 estará em recuperação)
     */

    public static void main(String[] args) {

        Double media = 5.0;

        Boolean aprovado = media >= 7.0;
        Boolean reprovado = media < 3.0;

        if (reprovado) {
            System.out.println("REPROVADO");
        } else if (aprovado) {
            System.out.println("APROVADO");
        } else {
            System.out.println("RECUPERAÇÃO");
        }

    }

}
