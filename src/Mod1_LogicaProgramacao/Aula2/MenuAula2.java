package Mod1_LogicaProgramacao.Aula2;

import java.util.Scanner;

public class MenuAula2 {

    public static void menuA2() {

        Scanner menu = new Scanner (System.in);

        while (true) {

            System.out.print("##---------Menu da aula 2---------##\n\n");
            System.out.print("|----------------------------------|\n");
            System.out.print("| Opção 1 - Exercício 1.2            |\n");
            System.out.print("| Opção 2 - Exercício 2.2            |\n");
            System.out.print("| Opção 3 - Exercício 3.2            |\n");
            System.out.print("| Opção 4 - Exercício 4.2            |\n");
            System.out.print("| Opção 5 - Exercício 5.2            |\n");
            System.out.print("| Opção 3 - Sair                   |\n");
            System.out.print("|----------------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 4) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("\nExercício 3");
                    Exercício1_2_1.aumentoSalario();
                    break;

                case 2:
                    System.out.print("\nExercício 4\n");
                    Exercício2_2_1.mediaSalario();
                    break;

                case 3:
                    System.out.print("\nExercício 5\n");
                    Exercício3_2_1.quadrante();
                    break;

                case 4:
                    System.out.print("\nExercício 6\n");
                    Exercício4_2_1.ehPrimo();
                    break;

                case 5:
                    System.out.print("\nExercício 7\n");
                    Exercício5_2_1.dividaAplicacao();
                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }
        }
    }
}
