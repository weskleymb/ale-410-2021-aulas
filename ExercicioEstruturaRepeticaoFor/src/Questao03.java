import java.util.Scanner;

public class Questao03 {

    /*
    Faça um programa que leia e valide as seguintes informações:
        Nome: maior que 3 caracteres;
        Idade: entre 0 e 150;
        Salário: maior que zero;
        Sexo: 'f' ou 'm';
        Estado Civil: 's', 'c', 'v', 'd';
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();

        for (Integer i = 1; nome.length() <= 3; i++) {
            System.out.println("QUANTIDADE DE LETRAS TEM QUE SER MAIOR QUE 03");
            System.out.println("Digite o seu nome novamente:");
            nome = scanner.nextLine();
        }

        System.out.println("Digite a sua idade:");
        Integer idade = scanner.nextInt();

        for (Integer i = 1; idade < 0 || idade > 150; i++) {
            System.out.println("A IDADE DEVE SER ENTRE 0 E 150");
            System.out.println("Digite a sua idade novamente:");
            idade = scanner.nextInt();
        }

    }

}
