package Mod1_LogicaProgramacao.Aula4;

import java.util.Scanner;

public class MenuAula4 {
    public static void menuA4() {

        Scanner menu = new Scanner (System.in);

        while (true) {

            System.out.print("##----------Menu da Aula 4----------##\n\n");
            System.out.print("| Opção 1 - Exercício 1.4            |\n");
            System.out.print("| Opção 2 - Sair                     |\n");
            System.out.print("|------------------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 2) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("\nExercício 1");
                    Exercício1_4_1.matrizQuadrada();
                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }
        }
    }
}
