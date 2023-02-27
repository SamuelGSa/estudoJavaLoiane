package aula13Exercicios;

import java.util.Scanner;

public class ex004 {
//        4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        int nota1 = scanner.nextInt();

        System.out.print("Digite a segunda nota: ");
        int nota2 = scanner.nextInt();

        System.out.print("Digite a terceira nota: ");
        int nota3 = scanner.nextInt();

        System.out.print("Digite a quarta nota: ");
        int nota4 = scanner.nextInt();

        System.out.println("A média das quatro notas é: " + ((nota1 + nota2 + nota3 + nota4)/4));
    }
}
