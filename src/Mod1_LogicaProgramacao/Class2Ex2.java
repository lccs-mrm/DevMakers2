package Mod1_LogicaProgramacao;

import java.util.Scanner;

public class Class2Ex2 {

    public static void main(String[] args) {

        double salario = 0.0;
        Scanner sc = new Scanner(System.in);
        String cargo;

        System.out.println("Informe seu cargo");
        cargo = sc.nextLine();

        System.out.println("Informe seu salário");
        salario = sc.nextDouble();

        switch (cargo) {
            case "técnico" -> salario *= 1.5;
            case "gerente" -> salario *= 1.3;
            case "demais" -> salario *= 1.2;
            default -> salario = 0;
        }
        System.out.printf("Seu novo salário é %.2f", salario);
    }
}