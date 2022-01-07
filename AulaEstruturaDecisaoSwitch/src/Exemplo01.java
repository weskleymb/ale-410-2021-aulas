import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("1 - Produtos");
        System.out.println("2 - Vendas");
        System.out.println("3 - Imóveis");
        System.out.println("20 - Perfumaria");
        System.out.println("Escolha uma opção acima:");
        Integer opcao = entrada.nextInt();

        switch (opcao) {
            case 1: case 5:
                System.out.println("Você está na seção de produtos");
                System.out.println("Bem vindo");
                break;
            case 2:
                System.out.println("Você está na seção de vendas");
                break;
            case 3:
                System.out.println("Você está na seção de imoveis");
                break;
            case 20:
                System.out.println("Você está na seção de perfumaria");
                break;
            default:
                System.out.println("Você não está numa seção valida");
        }
    }

}
