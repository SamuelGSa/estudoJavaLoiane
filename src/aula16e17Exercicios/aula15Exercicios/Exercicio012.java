package aula16e17Exercicios.aula15Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio012 {

// Desenvolva um gerador de Tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
// O usuario deve informar de qual numero ele deseja ver a tabuada.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva o numero que deseja ver a tabuada: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + numero*i);
    }
}
}