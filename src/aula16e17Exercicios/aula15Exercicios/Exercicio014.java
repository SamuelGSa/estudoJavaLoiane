package aula16e17Exercicios.aula15Exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio014 {

// Faça um programa que peça 10 numeros inteiros, calcule e mostre a
// quantidade de numeros pares e a quantidade de numeros impares
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        int contador = 0;
        do {
            System.out.print("Escolha um numero: ");
            Integer escolha = scanner().nextInt();
            lista.add(escolha);
            contador++;

        }while (contador <10);

        var impar = 0;
        var par = 0;
        for (Integer integer : lista) {
            if (integer % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("lista " + lista);
        System.out.println("Quantidade de números Pares:" + impar);
        System.out.println("Quantidade de números Impares: " + par);
        }

    static Scanner scanner(){
        return new Scanner(System.in);
    }

}