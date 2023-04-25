package aula15Exercicios;

import java.util.Scanner;

public class ex002 {

    //2. Faça um Programa que peça um valor e mostre na tela se o valor é
    //positivo ou negativo.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();

        if (num >= 0) System.out.println("Numero positivo");
        else System.out.println("Numero negativo");
    }
}
