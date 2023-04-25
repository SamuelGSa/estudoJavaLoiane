package aula15Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex006 {

    // 6. Faça um Programa que leia três números e mostre o maior deles.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        Integer num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        Integer num2 = scanner.nextInt();

        System.out.println("Digite o terceiro numero: ");
        Integer num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("O primeiro numero é o maior");
        }
        else if (num2 > num1 && num2 > num3) System.out.println("O segundo numero é o maior");
        else System.out.println("O terceiro numero é o maior");


    }
}
