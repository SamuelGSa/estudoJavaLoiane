package aula15Exercicios;

import java.util.Scanner;

public class ex001 {

    // 1. Faça um Programa que peça dois números e imprima o maior deles.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        int num2 = scanner.nextInt();

        if (num1 > num2) System.out.println("O Primeiro número é maior");
        else if(num2 > num1) System.out.println("O segundo número é maior");
        else System.out.println("São iguais");
    }
}
