import java.util.Scanner;

public class Questao03 {

    /*
    Faça um programa que leia e valide as seguintes informações:
        Nome: maior que 3 caracteres;
        Idade: entre 0 e 150;
        Salário: maior que zero;
        Sexo: 'f' ou 'm';
        Estado Civil: 's', 'c', 'v' ou 'd';
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        do {
            System.out.println("Informe seu nome:");
            nome = scanner.next();
        } while (nome.length() <= 3);

        Integer idade;
        do {
            System.out.println("Informe a sua idade:");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        Double salario;
        do {
            System.out.println("Informe o seu salário:");
            salario = scanner.nextDouble();
        } while (salario < 0);

        String sexo;
        do {
            System.out.println("Informe o seu sexo:");
            sexo = scanner.next();
        } while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f"));

        String estadoCivil;
        do {
            System.out.println("Informe o seu estado civil:");
            estadoCivil = scanner.next();
        } while (!estadoCivil.equalsIgnoreCase("s")
                && !estadoCivil.equalsIgnoreCase("c")
                && !estadoCivil.equalsIgnoreCase("v")
                && !estadoCivil.equalsIgnoreCase("d"));

    }

}
