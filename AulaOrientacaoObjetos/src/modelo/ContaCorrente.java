package modelo;

import modelo.Conta;

public class ContaCorrente extends Conta {

    private final Double TAXA = 1.0;

    private Double limite;

    public ContaCorrente(Integer numero, String titular, Double limite) {
        super(numero, titular);
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

}
