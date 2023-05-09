package aula15Exercicios;

import java.util.Scanner;

public class Ex006 {

    // 6. Faça um Programa que leia três números e mostre o maior deles.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor[] = new int[3];
        int maior = valor[0];

        for(int i = 0; i < valor.length; i++){
            System.out.print("Digite o " +(i+1)+"º valor: ");
            valor[i] = scanner.nextInt();
            if(valor[i] > maior){
                maior = valor[i];
            }
        }
        System.out.println("Maior valor = "+ maior);

    }
}
