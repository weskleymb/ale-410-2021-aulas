public class TestaQuadrado {

    public static void main(String[] args) {

        Quadrado q1 = new Quadrado();
        q1.setIdentificacao("weskley");
        q1.setLado(2.0);

        Quadrado q2 = new Quadrado();
        q2.setIdentificacao("edipo");
        q2.setLado(3.0);

        Quadrado q3 = new Quadrado();
        q3.setIdentificacao("jonatas");
        q3.setLado(5.0);

        System.out.println(q2.getArea());

    }

}
