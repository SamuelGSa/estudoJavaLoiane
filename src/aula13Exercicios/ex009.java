package aula13Exercicios;

import java.util.Scanner;

public class ex009 {
//    Faça um Programa que peça a temperatura em graus Farenheit,
//    transforme e mostre a temperatura em graus Celsius.
//    o C = (5 * (F-32) / 9).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Graus Farenheit: ");
        double farenheit = scanner.nextDouble();

        System.out.println("A temperatura convertida para Graus Célsius é: " + ((5 * (farenheit-32) / 9)));

    }
}
