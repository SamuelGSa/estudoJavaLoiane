package aula13Exercicios;

import java.util.Scanner;

public class ex016 {
//    16. Faça um programa para uma loja de tintas. O programa deverá pedir o
//    tamanho em metros quadrados da área a ser pintada. Considere que a
//    cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
//    tinta é vendida em latas de 18 litros, que custam R$ 80,00.
//    Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço
//    total.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero de metros quadadros que será pintado: ");
        int metrosQuadrados = scanner.nextInt();

        int litrosNecessarios = metrosQuadrados / 3;
        int qtdLatas = litrosNecessarios / 18;
        int precoTot = qtdLatas * 80;

        System.out.println("Você precisará de " + qtdLatas + " latas de tinta e, o total será de: R$ " + precoTot);
    }
}
