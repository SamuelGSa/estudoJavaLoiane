package aula15Exercicios;

import java.util.Scanner;

public class Ex010 {

    // 10.Faça um Programa que pergunte em que turno você estuda. Peça
    //para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
    //mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
    //Inválido!", conforme o caso.

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o Turno em que voce estuda (M - V - N): ");
        String turno = scanner.next();

        if (turno.equalsIgnoreCase("M")) System.out.println("Bom dia!");
        else if (turno.equalsIgnoreCase("V")) System.out.println("Boa Tarde!");
        else if (turno.equalsIgnoreCase("N")) System.out.println("Boa Noite!");
        else System.out.println("Valor inválido!");

    }

}
