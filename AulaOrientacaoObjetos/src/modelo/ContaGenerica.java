package modelo;

public abstract class ContaGenerica {

    // atributos
    private static Integer contadorContas = 0;

    protected Integer numero;
    protected Pessoa titular;
    protected Double saldo;

    // construtores
    public ContaGenerica(Pessoa titular) {
        contadorContas++;
        this.numero = contadorContas;
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
