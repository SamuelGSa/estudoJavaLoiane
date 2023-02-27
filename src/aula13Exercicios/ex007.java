package aula13Exercicios;

import java.util.Scanner;

public class ex007 {
//7. Faça um Programa que calcule a área de um quadrado,
// em seguida mostre o dobro desta área para o usuário.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de um dos lados do Quadrado: ");
        double ladoQuadrado = scanner.nextDouble();

        double area = Math.pow(ladoQuadrado,2);
        System.out.println("O Dobro da área desse quadrado é: " + (area * 2));

    }
}
