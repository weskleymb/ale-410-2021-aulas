public class ContaPoupanca extends Conta {

    private final Double PERCENTUAL = 1.0 / 100.0;

    public ContaPoupanca(Integer numero, String titular) {
        super(numero, titular);
    }

    public void render() {
        Double rendimento = getSaldo() * PERCENTUAL;
        depositar(rendimento);
    }

}
