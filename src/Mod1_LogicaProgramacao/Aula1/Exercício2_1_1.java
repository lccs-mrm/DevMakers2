package Mod1_LogicaProgramacao.Aula1;

import java.util.Scanner;
/*
O propósito desta atividade é armazenar variáveis via Scanner e fazer comparações com If else.
 */
public class Exercício2_1_1 {
    /**
     * Esta função vai comprar 3 números e informar o maior.
     */
    public static void comparaNumeros(){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if (number1 > number2 && number2 > number3){
            System.out.println(number1 + " é o maior número");
        }else if (number3 > number2){
            System.out.println(number3 + " é o maior número");
        }else{
            System.out.println(number2 + " é o maior número");
        }
        sc.close();
    }
}
