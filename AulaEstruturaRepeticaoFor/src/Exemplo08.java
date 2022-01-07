import java.util.Scanner;

public class Exemplo08 {

    public static void main(String[] args) {

        String impressao = "";

        for (Integer linha = 1; linha <= 3; linha++) {
            for (Integer coluna = 1; coluna <= 3; coluna++) {
                impressao += coluna + "" + linha + "\t";
            }
            impressao += "\n";
        }
        System.out.println(impressao);

    }

}
