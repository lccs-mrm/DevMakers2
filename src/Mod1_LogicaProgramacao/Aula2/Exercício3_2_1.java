package Mod1_LogicaProgramacao.Aula2;

import java.util.Scanner;
/*
Neste exercício faço uso de booleans para imprimir uma condição.
Também utilizo operador ternário.
 */
public class Exercício3_2_1 {
    /**
     * Nesta classe o usuário encontrará o uso de booleans para fazer definir a posição em um plano cartesiano.
     * Em comentário está a mesma estrutura em "if else", em execução está com operador ternário.
     */
    public static void quadrante() {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String quadrante;

        boolean A = x < 0 && y > 0;
        boolean B = x > 0 && y > 0;
        boolean C = x > 0 && y < 0;
        boolean D = x < 0 && y < 0;

        quadrante = A ? "A" : B ? "B" : C ? "C" : D ? "D" : "Sem quadrante";

        System.out.println("O quadrante é " + quadrante);

//       if (x > 0 && y > 0) {
//            System.out.println("Quadrante B");
//        } else if (x > 0 && y < 0) {
//            System.out.println("Quadrante C");
//        } else if (x < 0 && y > 0) {
//            System.out.println("Quadrante A");
//        } else if (x < 0 && y < 0) {
//            System.out.println("Quadrante D");
//        } else {
//            System.out.println("Sem quadrante");
//            sc.close();
        }
    }
