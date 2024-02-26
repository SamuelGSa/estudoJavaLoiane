package aula16e17Exercicios.aula15Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio010 {

// Faça um programa que receba dois numeros inteiros e
// gere os numeros inteiros que estao no intervalo comprometidos por eles.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Escreva o segundo numero: ");
        int numero2 = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = numero1 + 1; i < numero2; i++) {
            list.add(i);
        }
        System.out.println(list);

    }
}