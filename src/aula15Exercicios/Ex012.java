package aula15Exercicios;

import java.util.Scanner;

public class Ex012 {

    // 12.Faça um programa para o cálculo de uma folha de pagamento,
    //sabendo que os descontos são do Imposto de Renda, que depende do
    //salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
    //FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
    //a empresa que deposita). O Salário Líquido corresponde ao Salário
    //Bruto menos os descontos. O programa deverá pedir ao usuário o
    //valor da sua hora e a quantidade de horas trabalhadas no mês.
    //  - Desconto do IR:
    //  - Salário Bruto até 900 (inclusive) - isento
    //  - Salário Bruto até 1500 (inclusive) - desconto de 5%
    //  - Salário Bruto até 2500 (inclusive) - desconto de 10%
    //  - Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
    //  as informações, dispostas conforme o exemplo abaixo. No
    //  exemplo o valor da hora é 5 e a quantidade de hora é 220.
    public void descontosEmFolha(double salario, int aliquotaIR){
        System.out.println("Salário Bruto: R$ " + salario);
        double impostoDeRenda = (salario /100) * aliquotaIR;
        System.out.println("IR: R$ " + impostoDeRenda + " - ("+ aliquotaIR + "%)");
        double iNSS = (salario /100) * 10;
        System.out.println("INSS: R$ " + iNSS + " - (10%)");
        double fGTS = (salario /100) * 11;
        System.out.println("FGTS: R$ " + fGTS + " - (11%)");
        double totDescontos = impostoDeRenda + iNSS;
        System.out.println("Total de Descontos: R$ " + totDescontos);
        System.out.println("Salário Liquido: R$ " + (salario - totDescontos));
    }

    public static void main(String[] args) {
        Ex012 atividade = new Ex012();
        Scanner scanner = new Scanner (System.in);
        System.out.println("Valor por hora trabalhada: R$ ");
        double valorHora = scanner.nextDouble();
        System.out.println("Horas Trablahadas: ");
        int horasTrabalhadas = scanner.nextInt();
        double salario = valorHora * horasTrabalhadas;
        if (salario <= 900){
            atividade.descontosEmFolha(salario,0);
        } else if (salario <= 1500) {
            atividade.descontosEmFolha(salario,5);
        } else if (salario <= 2500){
            atividade.descontosEmFolha(salario,20);
        }
    }
}