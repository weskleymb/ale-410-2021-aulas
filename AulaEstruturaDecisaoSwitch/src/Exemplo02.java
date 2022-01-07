public class Exemplo02 {

    public static void main(String[] args) {

        String letra = "A";

        switch (letra.toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("VOGAL");
                break;
            default:
                System.out.println("NÃO É VOGAL");
        }

    }

}
