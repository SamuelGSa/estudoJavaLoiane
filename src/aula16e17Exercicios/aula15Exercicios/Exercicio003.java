package aula16e17Exercicios.aula15Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio003 {

//    Faça um programa que leia as seguintes informações:
//    a. Nome: maior que 3 caracteres;
//    b. idade: entre 0 e 150;
//    c. salario: maior que zero;
//    d. sexo: 'f' ou 'm';
//    e. Estado civil: 's','c','v','d';


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome,sexo,estadoCivil;
        int idade;
        double salario;
        do {
            System.out.print("Digite o nome do usuário: ");
            nome = scanner.next();

            System.out.print("Digite a idade do usuário: ");
            idade = scanner.nextInt();

            System.out.print("Digite o salário do usuário: ");
            salario = scanner.nextDouble();

            System.out.print("Digite o sexo do usuário: ");
            sexo = scanner.next();

            System.out.print("Digite o estado civil (s,c,v,d) do usuário: ");
            estadoCivil = scanner.next();

        }while (validaNome(nome) || validaIdade(idade) || validaSalario(salario) || validaSexo(sexo) || validaEstadoCivil(estadoCivil));

        System.out.println("==================");
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("salario: " + salario);
        System.out.println("sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
    }

    static boolean validaNome(String nome) {
        return nome.length() < 4;
    }

    static boolean validaIdade(int idade) {
        return idade < 4 || idade > 150;
    }

    static boolean validaSalario(double salario) {
        return salario < 0;
    }

    static boolean validaSexo(String sexo) {

        List<String> estadoCivilValido = Arrays.asList("F","M");

        return !estadoCivilValido.contains(sexo.toUpperCase());
    }

     static boolean validaEstadoCivil(String estadoCivil) {

        List<String> estadoCivilValido = Arrays.asList("S","C","V","D");

        return !estadoCivilValido.contains(estadoCivil.toUpperCase());
    }
}
