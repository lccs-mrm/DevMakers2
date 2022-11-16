package Mod1_LogicaProgramacao;

import java.util.Scanner;
/*
Crie um programa calculadora que recebe a operação matemática (somar, subtrair, multiplicar ou dividir) e os dois números. Mostre o resultado da operação.

Entrada:

Operação (somar, subtrair, multiplicar ou dividir)
Número 1
Número 2
Saida:

Resultado da operaçao
 */
public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1 = 0;
        double number2 = 0;
        System.out.println("Por favor, informe 2 números para operar.");
        number1 = sc.nextDouble();
        number2 = sc.nextDouble();

        String operacao = "";
        boolean validarOperacao = false;
        System.out.println("Por favor, escolha uma das quatro operações");
        do {
            operacao = sc.next();
            switch (operacao) {
                case "soma":
                    calculoSoma(number1, number2);
                    validarOperacao = true;
                    break;

                case "subtração":
                    calculoSubtracao(number1, number2);
                    validarOperacao = true;
                    break;

                case "multiplicação":
                    calculoMultiplicacao(number1, number2);
                    validarOperacao = true;
                    break;

                case "divisão":
                    calculoDivisao(number1, number2);
                    validarOperacao = true;
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, digite uma das duas médias, em uppercase e sem acento");
            }
        } while (!validarOperacao);
    }

    static void calculoSoma(double number1, double number2){
        printFinal(number1 + number2);
    }

    private static void calculoSubtracao(double number1, double number2){
        printFinal(number1 - number2);
    }

    static void calculoMultiplicacao(double number1, double number2){
        printFinal(number1 * number2);
    }

    static void calculoDivisao(double number1, double number2) {
        if (number2 == 0.0) {
            System.out.println("Essa operação não é possível");
        } else {
            printFinal(number1 / number2);
        }
    }

    private static void printFinal(double resultado){
        System.out.println("Resultado da operação: " + resultado);
    }
}