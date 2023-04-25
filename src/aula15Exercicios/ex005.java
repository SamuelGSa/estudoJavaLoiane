package aula15Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex005 {

    // 5. Faça um programa para a leitura de duas notas parciais de um aluno.
    //O programa deve calcular a média alcançada por aluno e apresentar:
    //o A mensagem "Aprovado", se a média alcançada for maior ou
    //igual a sete;
    //o A mensagem "Reprovado", se a média for menor do que sete;
    //o A mensagem "Aprovado com Distinção", se a média for igual a
    //dez.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota ");
        int nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota ");
        int nota2 = scanner.nextInt();
        if ((nota1 + nota2) / 2 == 10) System.out.println("Aprovado com Distinção");
        else if ((nota1 + nota2) / 2 >= 7) System.out.println("Aprovado");
        else System.out.println("Reprovado");

    }
}
