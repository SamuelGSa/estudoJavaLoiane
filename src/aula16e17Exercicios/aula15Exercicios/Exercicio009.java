package aula16e17Exercicios.aula15Exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio009 {

// Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50;

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i < 51; i++) {
            if (i%2 == 1){
                lista.add(i);
            }
        }
        System.out.println("Há " + lista.size() + " números ímpares");
        System.out.println(lista);

    }
}