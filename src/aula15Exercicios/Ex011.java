package aula15Exercicios;

import java.util.Scanner;

public class Ex011 {

    // 11.As Organizações Tabajara resolveram dar um aumento de salário aos
    //seus colaboradores e lhe contraram para desenvolver o programa que
    //calculará os reajustes.
    // Faça um programa que recebe o salário de um colaborador e o
    //reajuste segundo o seguinte critério, baseado no salário atual:
    //  - salários até R$ 280,00 (incluindo) : aumento de 20%
    //  - salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    //  - salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    //  - salários de R$ 1500,00 em diante : aumento de 5% Após o
    //    aumento ser realizado, informe na tela:
    //      -  salário antes do reajuste;
    //      - percentual de aumento aplicado;
    //      - valor do aumento;
    //      - novo salário, após o aumento.

    public void reajusteSalarial(Double salario, int reajuste){
        System.out.println("Salário antes de reajuste: " + salario);
        double aumento = (salario /100) * reajuste;
        salario += aumento;
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + salario);
    }

    public static void main(String[] args) {
        Ex011 atividade = new Ex011();

        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite seu salário: R$ ");
        double salario = scanner.nextDouble();

        if (salario <= 280 ){
            atividade.reajusteSalarial(salario,20);
        } else if (salario <= 700) {
            atividade.reajusteSalarial(salario,15);
        } else if (salario < 1500) {
            atividade.reajusteSalarial(salario,10);
        } else if (salario >= 1500) {
            atividade.reajusteSalarial(salario,5);
        }
    }
}
