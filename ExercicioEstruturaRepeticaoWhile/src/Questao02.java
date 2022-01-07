import java.util.Scanner;

public class Questao02 {

    /*
    Faça um programa que leia um nome de usuário
    e a sua senha e não aceite a senha igual
    ao nome do usuário, mostrando uma mensagem de erro
    e voltando a pedir as informações.
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome de usuario:");
        String usuario = entrada.next();

        System.out.println("Digite a senha:");
        String senha = entrada.next();

        while (usuario.equals(senha)) {

            System.out.println("Senha tem que ser diferente do usuario");

            System.out.println("Digite novamente a senha:");
            senha = entrada.next();

        }

    }

}
