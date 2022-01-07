public class Exemplo02 {

    public static void main(String[] args) {

        String nomes[] = {"jose", "joao", "lucas", "paulo", "pedro"};

        String alunos[][] = {{"jose", "silva"}, {"pedro", "lucas"}, {"roberto", "carlos"}};

        for (String aluno[] : alunos) {
            for (String nome : aluno) {
                System.out.println(nome);
            }
        }

    }

}
