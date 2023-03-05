package aula13Exercicios;

import java.util.Objects;
import java.util.Scanner;

public class ex013 {

//    13. Tendo como dados de entrada a altura e o sexo de uma pessoa,
//    construa um algoritmo que calcule seu peso ideal, utilizando as
//    seguintes fórmulas:
//    . Para homens: (72.7* altura) - 58
//    a. Para mulheres: (62.1* altura) - 44.7
//    b. Peça o peso da pessoa e informe se ela está dentro, acima ou
//    abaixo do peso.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu Sexo [Masculino ou Feminino]: ");
        String sex = scanner.next();

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        var imc = peso / altura * altura;

        if(Objects.equals(sex.toLowerCase(), "masculino")) {
            var pesoIdealMasculino = (72.7* altura) - 58;
            System.out.println("O peso ideial para homens com a sua altura é: " + pesoIdealMasculino);
        }
        else if(Objects.equals(sex.toLowerCase(), "feminino")) {
            var pesoIdealFeminino = (62.1 * altura) - 44.7;
            System.out.println("O peso ideial para mulheres com a sua altura é: " + pesoIdealFeminino);
        }

        if (imc >= 18.5 && imc <= 24.9 )System.out.println("IMC = Peso normal");
        else if (imc >= 25 && imc <= 29.9) System.out.println("IMC = Pré-obesidade");
        else if (imc >= 30 && imc <= 34.9) System.out.println("IMC = Obesidade Grau 1");
        else if (imc >= 35 && imc <= 39.9) System.out.println("IMC = Obesidade Grau 2");
        else if(imc > 40) System.out.println("IMC = Obesidade Grau 3");


    }
}
