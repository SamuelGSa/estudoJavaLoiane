package aula13Exercicios;

import java.util.Scanner;

public class ex010 {
//10. Faça um Programa que peça a temperatura em graus Celsius,
//    transforme e mostre em graus Farenheit.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Graus Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("A temperatura convertida para Graus Farenheit é: " + ((celsius* 1.8)+32));

    }
}
