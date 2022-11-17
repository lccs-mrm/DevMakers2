package Mod1_LogicaProgramacao.Lesson1;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args){
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
