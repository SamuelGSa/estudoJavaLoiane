package aula15Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex004 {

    // 4 Faça um Programa que verifique se uma letra digitada é vogal ou
    //consoante.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma Letra ");
        String letraDigitada = scanner.next();

        List<String> vogal = Arrays.asList("a","e","i","o","u");
        List<String> consoante = Arrays.asList("b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z");
        if (vogal.contains(letraDigitada)) System.out.println("É uma vogal");
        else if (consoante.contains(letraDigitada)) System.out.println("É uma Consoante");
        else System.out.println("É um número ou Caractere Especial");

    }
}
