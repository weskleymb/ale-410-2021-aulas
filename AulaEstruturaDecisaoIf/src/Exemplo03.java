public class Exemplo03 {

     /*
    informar se o aluno está aprovado ou reprovado
    (media ser maior que 7.0 estará aprovado)
     */

    public static void main(String[] args) {

        Double media = 10.0;

        Boolean aprovado = media > 7.0;

        if (aprovado) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

    }

}
