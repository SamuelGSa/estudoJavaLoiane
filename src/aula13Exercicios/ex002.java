package aula13Exercicios;

import java.util.Scanner;

public class ex002 {
//    Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um Número: ");
        int numero = scanner.nextInt();

        System.out.println("O numero escolhido foi o número: " + numero);
    }
}
