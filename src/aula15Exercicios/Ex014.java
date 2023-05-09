package aula15Exercicios;
import java.util.Scanner;

public class Ex014 {

    // 14.Faça um programa que lê as duas notas parciais obtidas por um aluno
    //numa disciplina ao longo de um semestre, e calcule a sua média. A
    //atribuição de conceitos obedece à tabela abaixo:

    //    O algoritmo deve mostrar na tela as notas, a média, o conceito
    //    correspondente e a mensagem “APROVADO” se o conceito for
    //    A, B ou C ou “REPROVADO” se o conceito for D ou E.

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 9 && media <= 10 ){
            System.out.println("Conceito: A");
            System.out.println("Aprovado");
        } else if (media >= 7.5 && media < 9) {
            System.out.println("Conceito: B");
            System.out.println("Aprovado");
        } else if (media >= 6 && media < 7.5) {
            System.out.println("Conceito: C");
            System.out.println("Aprovado");
        }else if (media >= 4 && media < 6) {
            System.out.println("Conceito: D");
            System.out.println("Reprovado");
        }else if (media < 4) {
            System.out.println("Conceito: E");
            System.out.println("Reprovado");
        }
    }
}