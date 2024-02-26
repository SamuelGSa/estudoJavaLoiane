package aula16e17Exercicios.aula15Exercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio008 {

// Faça um programa que leia 5 números e informe a soma e a média dos números

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(2, 4, 6, 1, 10);
        var soma = 0;

        for (Integer n : lista) {
            soma += n;

        }
        System.out.println("A soma de todos os valores é: " + soma);
        System.out.println("A média dos valores é: " + (soma / lista.size()));

    }
}