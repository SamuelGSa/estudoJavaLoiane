package aula13Exercicios;

import java.util.Scanner;

public class ex014 {

//    14. João Papo-de-Pescador, homem de bem, comprou um
//    microcomputador para controlar o rendimento diário de seu trabalho.
//    Toda vez que ele traz um peso de peixes maior que o estabelecido
//    pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
//    pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
//    você faça um programa que leia a variável peso (peso de peixes) e
//    verifique se há excesso. Se houver, gravar na variável excesso e na
//    variável multa o valor da multa que João deverá pagar. Caso contrário
//    mostrar tais variáveis com o conteúdo ZERO.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o peso dos peixes em KG: ");
        double peso = scanner.nextDouble();
        double pesoRegulamentado = 50.0;

        if (peso > pesoRegulamentado){
            var multa = (peso - pesoRegulamentado) * 4;
            System.out.println("Voce excedeu o limite em peso em " + (peso - pesoRegulamentado) + "Kg. Você pagará uma multa de R$ " + multa);
        } else System.out.println("Você não excedeu o limite de peso e não pagará multas");
    }
}
