package Mod1_LogicaProgramacao;

import java.util.Scanner;

public class Class2Ex4 {

    public static void main(String[] args) {

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