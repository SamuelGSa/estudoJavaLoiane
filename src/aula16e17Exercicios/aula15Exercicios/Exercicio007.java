package aula16e17Exercicios.aula15Exercicios;

import java.util.*;

public class Exercicio007 {

// Faça um programa que leia 5 números e informe o maior números

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(2,4,6,1,10);

        System.out.println("Lista original: " + lista);

        Collections.sort(lista);
        System.out.println("Lista Crescente: " + lista);
        System.out.println("O maior número da lista é: " + lista.get(0));
    }
}