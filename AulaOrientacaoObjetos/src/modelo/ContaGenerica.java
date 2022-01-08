package modelo;

public abstract class ContaGenerica {

    // atributos
    private Integer numero;
    private Pessoa titular;
    protected Double saldo;

    // construtores
    public ContaGenerica(Integer numero, Pessoa titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // metodos abstratos

    // metodos
    public Integer getNumero() {
        return numero;
    }

    public Pessoa getTitular() {
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

    public Boolean transferir(Double valor, ContaGenerica contaDestino) {
        if (this.sacar(valor)) {
            return contaDestino.depositar(valor);
        }
        return false;
    }

    @Override
    public String toString() {
        return "modelo.Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

}
