package teste;

import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import modelo.Pessoa;
import modelo.Sexo;

public class TestaConta {

    public static void main(String[] args) {

        Pessoa weskley = new Pessoa("weskley", 40, Sexo.MASCULINO);
        ContaPoupanca contaWeskley = new ContaPoupanca(weskley);

        Pessoa edipo = new Pessoa("edipo", 35, Sexo.MASCULINO);
        ContaCorrente contaEdipo = new ContaCorrente(edipo, 100.0);

        contaWeskley.depositar(300.0);
        contaEdipo.depositar(1000.0);

        contaEdipo.sacar(1099.0);

        ContaPoupanca contaMarcilio = new ContaPoupanca(edipo);


        System.out.println(contaWeskley);
        System.out.println(contaEdipo);


    }


}
