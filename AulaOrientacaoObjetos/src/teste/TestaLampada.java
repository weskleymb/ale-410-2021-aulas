package teste;

import modelo.Lampada;

public class TestaLampada {

    public static void main(String[] args) {

        Lampada lampada1 = new Lampada();
        lampada1.modificarLuminosidade(300.0);
        lampada1.modificarComprimento(200.0);
        lampada1.modificarPotencia(20.0);

        Lampada lampada2 = new Lampada();
        lampada2.modificarCor("amarela");
        lampada2.modificarLuminosidade(100.0);
        lampada2.modificarComprimento(20.0);
        lampada2.modificarPotencia(20.0);

        System.out.println(lampada2.verPropriedades());

    }

}
