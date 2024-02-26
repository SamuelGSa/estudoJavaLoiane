package aula16e17Exercicios.aula15Exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio006 {

// Faça um programa que imprima na tela os numeros de 1 a 20, um abaixo do outro.
// Depois modifique o programa para que ele mostre os numeros um ao lado do outro.

    public static void main(String[] args) {

        System.out.println("Um embaixo do outro");
        for (int i = 1; i < 21; i++) {
            System.out.println(i);
        }

        System.out.println("================================");
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            list.add(i);
            System.out.println(list);
        }
    }
}