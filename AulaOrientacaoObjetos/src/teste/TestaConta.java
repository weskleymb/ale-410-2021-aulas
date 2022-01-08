package teste;

import modelo.ContaGenerica;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import modelo.Pessoa;
import modelo.Sexo;

public class TestaConta {

    public static void main(String[] args) {

        Pessoa weskley = new Pessoa("weskley", 40, Sexo.MASCULINO);
        ContaPoupanca contaWeskley = new ContaPoupanca(123, weskley);

        Pessoa edipo = new Pessoa("edipo", 35, Sexo.MASCULINO);
        ContaCorrente contaEdipo = new ContaCorrente(222, edipo, 100.0);

        contaWeskley.depositar(300.0);
        contaEdipo.depositar(1000.0);

        contaEdipo.sacar(1099.0);

        System.out.println(contaEdipo);
        System.out.println(contaWeskley);


    }


}
