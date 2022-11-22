package Mod1_LogicaProgramacao.Aula2;
/*
Aqui estudo o uso de uma variável em uma sequência de operações.
 */
import java.util.Scanner;

/**
 * Nesta classe o usuário informa o seu salário, e terá como retorno:
 * Média anual, salário líquido mensal e anual, bruto anual e adicional de férias.
 */
public class Exercício2_2_1 {

    public static void mediaSalario(){

        double salario = 0.0;
        double mediaSalario = 0.0;
        double descontoSalario = 0.0;
        double tercoSalario = 0.0;
        double totalSalario = 0.0;

        System.out.println("Informe seu salário");
        Scanner sc = new Scanner(System.in);
        salario = sc.nextDouble();

        mediaSalario = (salario * 13) / 12;
        System.out.println("Seu salário médio em 1 ano é " + mediaSalario);

        descontoSalario = salario - (salario * 0.075);
        System.out.println("Seu salário líquido é " + descontoSalario);

        tercoSalario = salario + (salario / 3);
        System.out.println("Seu salário com férias é " + tercoSalario);

        totalSalario = (descontoSalario * 13) + tercoSalario;
        System.out.println("Seu salário líquido anual é " + totalSalario);

        totalSalario = (mediaSalario * 13) + tercoSalario;
        System.out.println("Seu salário bruto anual é " + totalSalario);
    }
}
