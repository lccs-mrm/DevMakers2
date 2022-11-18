package Mod1_LogicaProgramacao.Lesson2;

import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {

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
