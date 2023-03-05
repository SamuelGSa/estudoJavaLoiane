package aula13Exercicios;

import java.util.Scanner;

public class ex015 {

//    15. Faça um Programa que pergunte quanto você ganha por hora e o
//    número de horas trabalhadas no mês.
//    Calcule e mostre o total do seu
//    salário no referido mês, sabendo-se que são descontados 11% para o
//    Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
//    programa que nos dê:
//            . salário bruto.
//    a. quanto pagou ao INSS.
//    b. quanto pagou ao sindicato.
//    c. o salário líquido.
//    d. calcule os descontos e o salário líquido, conforme a tabela
//    abaixo:
//            + Salário Bruto :
//            IR (11%) :
//            INSS (8%) :
//            Sindicato ( 5%)
//    Obs.: Salário Bruto - Descontos = Salário Líquido.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o valor recebido em R$ por hora trabalhada: ");
        double valorHoraTrabalhada = scanner.nextDouble();

        double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;

        double impostoDeRenda = (salarioBruto *11) / 100;
        double inss = (salarioBruto *8) / 100;
        double sindicatos = (salarioBruto *5) / 100;

        System.out.println("O Seu salário bruto é de: R$ " + salarioBruto);
        System.out.println("Desconto INSS: R$ " + inss);
        System.out.println("Desonto dos Sindicatos: R$ " + sindicatos);
        System.out.println("Desconto Imposto de Renda: R$ " + impostoDeRenda);
        System.out.println("Salário Liquido: R$ " + (salarioBruto - impostoDeRenda -inss - sindicatos));


    }
}
