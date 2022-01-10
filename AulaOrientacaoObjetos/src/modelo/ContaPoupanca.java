package modelo;

public class ContaPoupanca extends ContaGenerica {

    private final Double PERCENTUAL = 1.0 / 100.0;

    public ContaPoupanca(Pessoa titular) {
        super(titular);
    }

    public void render() {
        Double rendimento = getSaldo() * PERCENTUAL;
        depositar(rendimento);
    }

}
