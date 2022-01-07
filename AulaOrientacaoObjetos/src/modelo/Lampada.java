public class Lampada {

    // propriedades (atributos)
    private Double luminosidade = 0.0;
    private Double comprimento = 0.0;
    private Double potencia = 0.0;
    private String cor = "branca";
    private Boolean estado = false;

    // funcionalidades (metodos)
    void ligar() {
        estado = true;
    }

    void desligar() {
        estado = false;
    }

    String verEstado() {
        if (estado) {
            return "LIGADA";
        }
        return "DESLIGADA";
    }

    void modificarCor(String novaCor) {
        if (novaCor.equalsIgnoreCase("branca")
                || novaCor.equalsIgnoreCase("amarela")) {
            cor = novaCor;
        } else {
            System.out.println("COR NÃO MODIFICADA");
        }
    }

    String verCor() {
        return cor;
    }

    void modificarLuminosidade(Double novaLuminosidade) {
        Boolean luminosidadeValida = novaLuminosidade >= 0.0;
        if (luminosidadeValida) {
            luminosidade = novaLuminosidade;
        } else {
            System.out.println("LUMINOSIDADE INVALIDA");
        }
    }

    Double verLuminosidade() {
        return luminosidade;
    }

    void modificarComprimento(Double novoComprimento) {
        Boolean comprimentoValido = novoComprimento >= 0.0;
        if (comprimentoValido) {
            comprimento = novoComprimento;
        } else {
            System.out.println("COMPRIMENTO INVALIDO");
        }
    }

    Double verComprimento() {
        return comprimento;
    }

    void modificarPotencia(Double novaPotencia) {
        Boolean potenciaValida = novaPotencia >= 0.0;
        if (potenciaValida) {
            potencia = novaPotencia;
        } else {
            System.out.println("POTENCIA INVALIDA");
        }
    }

    Double verPotencia() {
        return potencia;
    }

    String verPropriedades() {
        return "Lampada[cor='" + verCor() + "', " +
                "luminosidade=" + verLuminosidade() + ", " +
                "comprimento=" + verComprimento() + ", " +
                "potencia=" + verPotencia() + ", " +
                "estado=" + verEstado() + "]";
    }

}
