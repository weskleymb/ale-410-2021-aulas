public class TestaPessoa {

    public static void main(String[] args) {

        Pessoa pedro = new Pessoa("Pedro", 15, 30.0, 150.0);

        System.out.println(pedro);

        pedro.envelhecer();
        pedro.envelhecer();
        pedro.envelhecer();
        pedro.envelhecer();
        pedro.envelhecer();
        pedro.envelhecer();
        pedro.envelhecer();
        pedro.envelhecer();

        System.out.println(pedro);

    }

}
