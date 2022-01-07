public class Questao11 {

    /*
    As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores
    e lhe contraram para desenvolver o programa que calculará os reajustes.

    Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério,
    baseado no salário atual:

    salários até R$ 280,00 (incluindo) : aumento de 20%
    salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
    o salário antes do reajuste;
    o percentual de aumento aplicado;
    o valor do aumento;
    o novo salário, após o aumento.
     */

    public static void main(String[] args) {

        Double salarioAtual = 120.0;
        String percentualAumento = "0%";
        Double valorDoAumento = 0.0;
        Double salarioNovo = 0.0;

        Boolean temAumentoDe20 = salarioAtual <= 280.0;

        if (temAumentoDe20) {
            percentualAumento = "20.0%";
            valorDoAumento = salarioAtual * 0.2;
            salarioNovo = salarioAtual + valorDoAumento;
        }

        System.out.println("Salário antes do reajuste: R$ " + salarioAtual);
        System.out.println("Percentual aplicado: " + percentualAumento);
        System.out.println("Valor do aumento: R$ " + valorDoAumento);
        System.out.println("Salário após o aumento: R$ " + salarioNovo);

    }

}
