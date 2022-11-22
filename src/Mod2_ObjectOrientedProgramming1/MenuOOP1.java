package Mod2_ObjectOrientedProgramming1;

import Mod1_LogicaProgramacao.Aula5.Exercício1_5_1;

import java.util.Scanner;
public class MenuOOP1 {
    public static void menuOOP1() {

        Scanner menu = new Scanner(System.in);

        while (true) {

            System.out.print("##----------Menu do Módulo 2 - POO----------##\n\n");
            System.out.print("| Opção 1 - Aula 1                           |\n");
            System.out.print("| Opção 3 - Sair                             |\n");
            System.out.print("|--------------------------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 3) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("\nAula 1");
                    System.out.println("\nAinda não implementado\n");
                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }
        }
    }
}
