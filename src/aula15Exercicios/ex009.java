package aula15Exercicios;

import java.util.*;
import java.util.stream.Collectors;

public class ex009 {

    // 9. Faça um Programa que leia três números e mostre-os em ordem
    //decrescente.

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        List<Integer> valor = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            System.out.print("Digite o " +(i+1)+"º valor: ");
            valor.add(scanner.nextInt());
        }
        Collections.sort(valor);
        System.out.println("Os números em ordem crescente ficam assim = "+ valor);
    }

}
