public class Quadrado {

    // atributos
    private String identificacao = "generico";
    private Double lado = 0.0;

    // metodos
    public Double getPerimetro() {
        Double perimetro = this.lado * 4;
        return perimetro;
    }

    public Double getArea() {
        Double area = this.lado * lado;
        return area;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "identificacao='" + identificacao + '\'' +
                ", lado=" + lado +
                '}';
    }
}
