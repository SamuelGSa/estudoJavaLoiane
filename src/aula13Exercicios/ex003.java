package aula13Exercicios;

import java.util.Scanner;

public class ex003 {
//3. Faça um Programa que peça dois números e imprima a soma.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um Número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite outro Número: ");
        int numero2 = scanner.nextInt();

        System.out.println("A soma do numero " + numero1 + " com o número " + numero2 + " é: " + (numero1 + numero2));
    }
}
