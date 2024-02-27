package aula16e17Exercicios.aula15Exercicios;

import java.util.Scanner;

public class Exercicio013 {

// Faça um programa que peça dois numeros, base e expoente.
// Calcule e mostre o primeiro número elevado ao segundo numero. não utilize a função de potencia da linguagem.

//    Li o contexto erro e fiz um programa que faça a potencial de qualquer numero, rs

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva a base que deseja: ");
        int base = scanner.nextInt();

        System.out.print("Escreva o expoente que deseja: ");
        int expoente = scanner.nextInt();

        int resultado = 0;
        int resultado2 = 0;

        for (int i = 0; i < expoente; i++){
            if (i == 0) {
                resultado = base * base;
                System.out.println(resultado);
            } else {
                resultado2 = resultado * base;
                resultado = resultado2;
                System.out.println(resultado2);
            }

        }
}
}