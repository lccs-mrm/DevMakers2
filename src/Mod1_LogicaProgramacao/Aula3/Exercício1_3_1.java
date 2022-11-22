package Mod1_LogicaProgramacao.Aula3;

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
public class Exercício1_3_1 {
    /**
     * Aqui o usuário pode inserir 2 números no formato double e uma string indicando a operação aritmética a executar;
     * As entradas entrarão em um "do while" alimentando por "switch case".
     * O laço começa até que um "switch case" seja acionado, então a variável boolean se torna verdadeira e a
     * condição "while" é encerrada.
     */
    public static void calcula2Numeros() {
        Scanner sc = new Scanner(System.in);
        double number1 = 0;
        double number2 = 0;
        System.out.println("Por favor, informe 2 números para operar.");
        number1 = sc.nextDouble();
        number2 = sc.nextDouble();

        String operacao = "";
        boolean validarOperacao = false;
        System.out.println("Por favor, escolha uma das quatro operações aritméticas");
        do {
            operacao = sc.next();
            switch (operacao) {
                case "+" -> {
                    calculoSoma(number1, number2);
                    validarOperacao = true;
                }
                case "-" -> {
                    calculoSubtracao(number1, number2);
                    validarOperacao = true;
                }
                case "*" -> {
                    calculoMultiplicacao(number1, number2);
                    validarOperacao = true;
                }
                case "/" -> {
                    calculoDivisao(number1, number2);
                    validarOperacao = true;
                }
                default -> System.out.println("Opção inválida. Por favor, digite uma das duas operações");
            }
        } while (!validarOperacao);
    }

    /**
     * Aqui estão 4 métodos executando as operações;
     * @param number1 vai ser operado conforme informado no início da operação;
     * @param number2 vai ser operado conforme informado no início da operação;
     */
    static void calculoSoma(double number1, double number2){
        printFinal(number1 + number2);
    }

    static void calculoSubtracao(double number1, double number2){
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

    /**
     * Após um dos quatro métodos ser chamado pelo "switch case",
     * @param resultado é uma variável produzida em um dos quatro métodos acima.
     * ela então é usada no método "printFinal", descrito abaixo, fazendo apenas a impressão do resultado da operação.
     */
    private static void printFinal(double resultado){

        System.out.println("Resultado da operação: " + resultado);
    }
}
