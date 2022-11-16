package Mod1_LogicaProgramacao;
/*
    Desenvolver um programa que deverá desenhar um triângulo conforme a figura abaixo.
    O programa deverá receber quantidade de linhas a serem impressas.
    Exemplo, se for informado 10 linhas, o resultado deverá ser:
    **********
    *********
    ********
    *******
    ******
    *****
    ****
    ***
    **
    *
 */
import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número inteiro e positivo");
        int triangle = sc.nextInt();

        for (int i = triangle; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}