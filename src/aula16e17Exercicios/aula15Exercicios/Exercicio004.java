package aula16e17Exercicios.aula15Exercicios;

public class Exercicio004 {

//    Segundo que a população de um país 'A' seja da ordem de 80.000 habitantes  com uma taxa anual de crescimento de 3% e que a população de 'B' seja 200.000 habitantes com uma taxa de crescimento de 1.5%.
//    Faça um programa que calcule e escreva o número de anos necessários para que a população do país 'A' ultrapasse ou iguale a população do país 'B', mantidas as taxas de crescimento.


    public static void main(String[] args) {

        Integer populacaoA = 80000;
        Integer populacaoB = 200000;
        int anos = 0;

            do {
                populacaoA = calculaCrescimentoPopulacional(populacaoA,3);
                populacaoB = calculaCrescimentoPopulacional(populacaoB,1.5);
                anos++;

                System.out.println("================================");
                System.out.println("Ano: " + anos);
                System.out.println("População A: "+ populacaoA);
                System.out.println("População B: "+ populacaoB);


            }while (populacaoA <= populacaoB);

        System.out.println("================================");
        System.out.println("Foram necessários: " + anos + " anos necessários para que a população do país 'A' ultrapassase ou igualasse a população do país 'B', mantidas as taxas de crescimento");
        System.out.println("População final de 'A': "+ populacaoA);
        System.out.println("População final de 'B': "+ populacaoB);
    }

    static Integer calculaCrescimentoPopulacional(Integer populacaoInicial, double taxaCrescimento) {
        var calculo = populacaoInicial * taxaCrescimento / 100;
        var b = calculo + populacaoInicial;
        return (int)Math.round(b);
    }
}