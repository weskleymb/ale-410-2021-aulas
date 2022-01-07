public class Conta extends Object {

    // atributos
    private Integer numero;
    private String titular;
    protected Double saldo;

    // construtores
    public Conta(Integer numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // metodos
    public Integer getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Boolean sacar(Double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public Boolean depositar(Double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public Boolean transferir(Double valor, Conta contaDestino) {
        if (this.sacar(valor)) {
            return contaDestino.depositar(valor);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

}
