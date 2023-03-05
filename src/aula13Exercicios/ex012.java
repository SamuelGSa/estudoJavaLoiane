package aula13Exercicios;

import java.util.Scanner;

public class ex012 {

//    12. Tendo como dados de entrada a altura de uma pessoa, construa um
//    algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
//    (72.7*altura) - 58

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        var pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O seu peso ideal para sua altura é: " + pesoIdeal + "Kg.");
    }
}
