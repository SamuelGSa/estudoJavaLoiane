package aula16e17Exercicios.aula15Exercicios;

import java.util.Scanner;

public class Exercicio001 {

//    Faça um progrma aque peça uma nota, entre 0 e 10.
//    Mostre uma mensagem caso o valor seja válido
//    e continue pedindo até que o usuário informe um valor válido.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;
        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextInt();

        }while (nota >10 || nota < 0);
    }



}
