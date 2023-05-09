package aula15Exercicios;

import java.util.Scanner;

public class Ex008 {

    // 8. Faça um programa que pergunte o preço de três produtos e informe
    //qual produto você deve comprar, sabendo que a decisão é sempre
    //pelo mais barato.

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int valor[] = new int[3];
        int menor = Integer.MAX_VALUE;

        for(int i = 0; i < valor.length; i++){
            System.out.print("Digite o " +(i+1)+"º valor do produto: ");
            valor[i] = scanner.nextInt();
            if(valor[i] < menor){
                menor = valor[i];
            }
        }
        System.out.println("O produto com o menor valor custa = "+ menor);
    }

}
