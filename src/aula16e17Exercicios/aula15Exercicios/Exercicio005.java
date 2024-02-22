package aula16e17Exercicios.aula15Exercicios;

import java.util.Scanner;

public class Exercicio005 {

// Alere o programa anteerior, permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int anos = 0;
        int escolha;

        do {

        System.out.print("Digite o valor da população 'A': ");
        Integer populacaoA = scanner.nextInt();

        System.out.print("Digite a taxa de crescimento populacional de 'A': ");
        double taxaA = scanner.nextDouble();


        System.out.print("Digite o valor da população 'B': ");
        Integer populacaoB = scanner.nextInt();

        System.out.print("Digite a taxa de crescimento populacional de 'B': ");
        double taxaB = scanner.nextDouble();

            do {
                populacaoA = calculaCrescimentoPopulacional(populacaoA,taxaA);
                populacaoB = calculaCrescimentoPopulacional(populacaoB,taxaB);
                anos++;

            }while (populacaoA <= populacaoB);

            System.out.println("================================");
            System.out.println("Foram necessários: " + anos + " anos necessários para que a população do país 'A' ultrapassase ou igualasse a população do país 'B', mantidas as taxas de crescimento");
            System.out.println("População final de 'A': "+ populacaoA);
            System.out.println("População final de 'B': "+ populacaoB);
            System.out.println("================================");

            System.out.print("Deseja fazer outra consulta? Digite '1' para SIM e '2' para NÃO: ");
            escolha = scanner.nextInt();

        }while (escolha == 1 );

    }

    static Integer calculaCrescimentoPopulacional(Integer populacaoInicial, double taxaCrescimento) {
        var calculo = populacaoInicial * taxaCrescimento / 100;
        var b = calculo + populacaoInicial;
        return (int)Math.round(b);
    }
}