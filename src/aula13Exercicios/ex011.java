package aula13Exercicios;

import java.util.Scanner;

public class ex011 {
//        1. Faça um Programa que peça 2 números inteiros e um número real.
//    Calcule e mostre:
//    a. o produto do dobro do primeiro com metade do segundo .
//    b. a soma do triplo do primeiro com o terceiro.
//    c. o terceiro elevado ao cubo.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero inteiro: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite um numero real: ");
        double num3 = scanner.nextDouble();

        var res1 = (num1 * 2) + (num2 / 2);
        var res2 = (num1 * 3) + num3;
        var res3 = Math.pow(num3,3);

        System.out.println("===============");
        System.out.println("o produto do dobro do primeiro com metade do segundo é : " + res1);
        System.out.println("a soma do triplo do primeiro com o terceiro é: " + res2);
        System.out.println("o terceiro elevado ao cubo é: " + res3);


    }
}
