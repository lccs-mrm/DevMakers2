package Mod1_LogicaProgramacao;

import java.util.Scanner;

public class Class1Ex2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if (number1 > number2){
            System.out.println(number1 + number2);
        }else {
            System.out.println(number2 + number1);
        }
        sc.close();
    }
}
