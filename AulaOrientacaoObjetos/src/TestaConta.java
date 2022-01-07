public class TestaConta {

    public static void main(String[] args) {

        ContaPoupanca contaWeskley = new ContaPoupanca(123, "weskley");
        ContaCorrente contaEdipo = new ContaCorrente(222, "edipo", 100.0);

        contaWeskley.depositar(300.0);
        contaEdipo.depositar(1000.0);

        contaEdipo.sacar(1099.0);

        System.out.println(contaEdipo);
        System.out.println(contaWeskley);
    }


}
