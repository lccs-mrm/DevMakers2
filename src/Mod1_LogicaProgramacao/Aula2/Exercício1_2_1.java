package Mod1_LogicaProgramacao.Aula2;

import java.util.Scanner;
/*
Aqui estudo uso de "switch case" tomando como exemplo aumento salarial.
 */
public class Exercício1_2_1 {
    /**
     * Nesta classe será informado um cargo, entre 3, e será o valor do salário após aumento.
     */
    public static void aumentoSalario() {

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