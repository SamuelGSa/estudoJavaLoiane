package aula13Exercicios;

import java.util.Scanner;

public class ex008 {
//8. Faça um Programa que pergunte quanto você ganha por hora e o
//    número de horas trabalhadas no mês. Calcule e mostre o total do seu
//    salário no referido mês.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da sua hora trabalhada em reais: ");
        double salarioHora = scanner.nextDouble();

        System.out.print("Digite o numero de horas trabalhadas no mês: ");
        int horastrabalhadasMes = scanner.nextInt();

        System.out.println("O seu salário no final do mês será de: R$ " + (salarioHora * horastrabalhadasMes));


    }
}
