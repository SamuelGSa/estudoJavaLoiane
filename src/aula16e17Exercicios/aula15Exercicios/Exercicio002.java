package aula16e17Exercicios.aula15Exercicios;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio002 {

//    Faça um programa que leia o nome de usuário
//    e a sua senha e não aceite a senha igual ao nome do usuário,
//    mostrando uma mensagem de erro e voltando a pedir as informações


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome,senha;
        do {
            System.out.print("Digite o nome do usuário: ");
            nome = scanner.next();

            System.out.print("Digite uma senha: ");
            senha = scanner.next();

            if (Objects.equals(nome.toUpperCase(),senha.toUpperCase())){
                System.out.println("Senha inválida. Os campos precisam ter valores diferentes");
            }

        }while (Objects.equals(nome.toUpperCase(), senha.toUpperCase()));
    }



}
