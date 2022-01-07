package modelo;

public class Lampada {

    // propriedades (atributos)
    private Double luminosidade = 0.0;
    private Double comprimento = 0.0;
    private Double potencia = 0.0;
    private String cor = "branca";
    private Boolean estado = false;

    // funcionalidades (metodos)
    public void ligar() {
        estado = true;
    }

    public void desligar() {
        estado = false;
    }

    public String verEstado() {
        if (estado) {
            return "LIGADA";
        }
        return "DESLIGADA";
    }

    public void modificarCor(String novaCor) {
        if (novaCor.equalsIgnoreCase("branca")
                || novaCor.equalsIgnoreCase("amarela")) {
            cor = novaCor;
        } else {
            System.out.println("COR NÃO MODIFICADA");
        }
    }

    public String verCor() {
        return cor;
    }

    public void modificarLuminosidade(Double novaLuminosidade) {
        Boolean luminosidadeValida = novaLuminosidade >= 0.0;
        if (luminosidadeValida) {
            luminosidade = novaLuminosidade;
        } else {
            System.out.println("LUMINOSIDADE INVALIDA");
        }
    }

    public Double verLuminosidade() {
        return luminosidade;
    }

    public void modificarComprimento(Double novoComprimento) {
        Boolean comprimentoValido = novoComprimento >= 0.0;
        if (comprimentoValido) {
            comprimento = novoComprimento;
        } else {
            System.out.println("COMPRIMENTO INVALIDO");
        }
    }

    public Double verComprimento() {
        return comprimento;
    }

    public void modificarPotencia(Double novaPotencia) {
        Boolean potenciaValida = novaPotencia >= 0.0;
        if (potenciaValida) {
            potencia = novaPotencia;
        } else {
            System.out.println("POTENCIA INVALIDA");
        }
    }

    public Double verPotencia() {
        return potencia;
    }

    public String verPropriedades() {
        return "modelo.Lampada[cor='" + verCor() + "', " +
                "luminosidade=" + verLuminosidade() + ", " +
                "comprimento=" + verComprimento() + ", " +
                "potencia=" + verPotencia() + ", " +
                "estado=" + verEstado() + "]";
    }

}
