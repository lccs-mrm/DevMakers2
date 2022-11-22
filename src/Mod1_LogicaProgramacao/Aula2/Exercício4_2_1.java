package Mod1_LogicaProgramacao.Aula2;

import java.util.Scanner;
/*
Aqui é feita uma identificação de números primos com while.
 */
public class Exercício4_2_1 {
    /**
     * Nesta classe o usuário insere um número e tem como retorno se é primo ou não.
     */
    public static void ehPrimo() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número \n");
        int number = sc.nextInt();
        boolean ehPrimo = true;
        int divisor = 2;

        while (number % divisor != 0){
            divisor++;
            break;
        }
        if (divisor == number) {
            System.out.println("O número é primo");
        } else if (number == 1) {
            System.out.println("O número 1 NÃO é primo");
        } else {
            System.out.println("O número não é primo");
        }
    }
}