package aula16e17Exercicios.aula15Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio011 {

// Altere o programa anterior para mostrar no final a soma dos números

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Escreva o segundo numero: ");
        int numero2 = scanner.nextInt();

        int soma = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = numero1 + 1; i < numero2; i++) {
            soma = soma + i;
            list.add(i);
        }
        System.out.println(list);
        System.out.println(soma);

    }
}