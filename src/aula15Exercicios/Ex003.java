package aula15Exercicios;

import java.util.Scanner;

public class Ex003 {

    // 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
    //Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o sexo (M ou F): ");
        String letraDigitada = scanner.next();

        if (letraDigitada.equalsIgnoreCase("M")) System.out.println("Masculino");
        else if (letraDigitada.equalsIgnoreCase("F")) System.out.println("Feminino");

    }
}
