package aula15Exercicios;

import java.util.Scanner;

public class Ex007 {

    // 7. Faça um Programa que leia três números e mostre o maior e o menor
    //deles.
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int valor[] = new int[3];
        int maior = valor[0];
        int menor = Integer.MAX_VALUE;

        for(int i = 0; i < valor.length; i++){
            System.out.print("Digite o " +(i+1)+"º valor: ");
            valor[i] = scanner.nextInt();
            if(valor[i] > maior){
                maior = valor[i];
            }
        }
        for (int j = 0; j < valor.length; j++) {
            if(valor[j] < menor){
                menor = valor[j];
            }
        }
        System.out.println("Maior valor = "+ maior);
        System.out.println("Menor valor = "+ menor);
    }

}
