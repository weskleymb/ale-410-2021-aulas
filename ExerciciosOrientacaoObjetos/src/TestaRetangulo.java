import java.util.Scanner;

public class TestaRetangulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as dimensões do espaço:");
        Double larguraEspaco = scanner.nextDouble();
        Double comprimentoEspaco = scanner.nextDouble();

        Retangulo espaco = new Retangulo(larguraEspaco, comprimentoEspaco);

        System.out.println("Informe as dimensões do azulejo:");
        Double larguraPiso = scanner.nextDouble();
        Double comprimentoPiso = scanner.nextDouble();

        Retangulo piso = new Retangulo(larguraPiso, comprimentoPiso);

        System.out.println("Informe as dimensões do rodapé:");
        Double larguraRodape = scanner.nextDouble();
        Double comprimentoRodape = scanner.nextDouble();

        Retangulo rodape = new Retangulo(comprimentoRodape, larguraRodape);

        Double quantidadePisos = espaco.getArea() / piso.getArea();

        Double quantidadeRodapes = espaco.getPerimetro() / rodape.getBase();

        System.out.println("Quantidade de peças é " + quantidadePisos);

    }

}
