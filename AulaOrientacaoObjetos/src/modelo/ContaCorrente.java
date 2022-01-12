package modelo;

public class ContaCorrente extends ContaGenerica {

    private final Double TAXA = 1.0;

    private Double limite;

    public ContaCorrente(Pessoa titular, Double limite) {
        super(titular);
        this.limite = limite;
    }

    @Override
    public Boolean sacar(Double valor) {
        Double valorComTaxa = valor + TAXA;
        Double saldoComLimite = saldo + limite;
        if (valor >= 0 && valorComTaxa <= saldoComLimite) {
            saldo -= valorComTaxa;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero=" + numero +
                ", titular=" + titular +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }

}
