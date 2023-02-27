package aula13Exercicios;

import java.util.Scanner;

public class ex006 {
//        6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio de um círculo: ");
        double raio = scanner.nextInt();

        System.out.println("A área do círculo cujo raio é " + raio + " é: " + (Math.PI * raio * raio));
    }
}
