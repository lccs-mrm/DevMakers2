package Mod1_LogicaProgramacao.Aula2;

import java.util.Scanner;

/*
Aqui um outro exercício com while.
 */
public class Exercício5_2_1 {
    /**
     * Nesta classe o usuário informa o tamanho da sua dívida e de sua aplicação financeira.
     * O retorno será o tempo necessário para a quitação da dívida apenas com a aplicação.
     * Ainda é necessário inserir os números no formato x,y.
     */
    public static void dividaAplicacao(){

        System.out.println("Informe o valor da sua dívida: ");
        Scanner sc = new Scanner(System.in);
        double divida = sc.nextDouble();

        System.out.println("Informe os juros incidentes sobre a dívida: ");
        double jurosDivida = sc.nextDouble();

        System.out.println("Informe o montante aplicado: ");
        double aplicacao = sc.nextDouble();

        System.out.println("Informe o juros sobre a aplicação: ");
        double jurosAplicacao = sc.nextDouble();

        int mes = 0;

        while(divida > aplicacao){
            divida = divida + (divida * (jurosDivida/100));
            aplicacao = aplicacao + (aplicacao * (jurosAplicacao/100));
            mes++;
        }
        System.out.printf("A quantidade de meses necessários é: " + mes);
        System.out.printf("Ou, aproximadamente, " + mes / 12 + " anos");
    }
}
