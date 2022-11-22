package Mod1_LogicaProgramacao.Aula5;

import java.util.Scanner;

public class MenuAula5 {

    public static void menuA5() {

        Scanner menu = new Scanner (System.in);

        while (true) {

            System.out.print("##----------Menu da Aula 5----------##\n\n");
            System.out.print("| Opção 1 - Exercício 1.5            |\n");
            System.out.print("| Opção 2 - Exercício 2.5            |\n");
            System.out.print("| Opção 3 - Sair                     |\n");
            System.out.print("|------------------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 3) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("\nExercício 1");
                        Exercício1_5_1.registroDAlunos();
                    break;

                case 2:
                    System.out.print("\nExercício 2");

                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }
        }
    }
}
