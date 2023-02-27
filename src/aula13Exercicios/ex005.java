package aula13Exercicios;

import java.util.Scanner;

public class ex005 {
//        5. Faça um Programa que converta metros para centímetros.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a medida em metros: ");
        float medidaEmMetros = scanner.nextFloat();

        System.out.println("A medida informada transformada em centímetros é : " + (int)(medidaEmMetros * 100) + "cm.");
    }
}
