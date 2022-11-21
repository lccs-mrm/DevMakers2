package Mod1_LogicaProgramacao;

import Mod1_LogicaProgramacao.Aula5.RegistroDAlunos;
import com.sun.tools.javac.Main;

import java.util.Scanner;

public class MenuLogicaProgramacao {

    public static void menuLogica() {

        Scanner menu = new Scanner (System.in);

        while (true) {

            System.out.print("##--Menu do Módulo de Lógica de Programação--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Aula 1            |\n");
            System.out.print("| Opção 2 - Aula 2            |\n");
            System.out.print("| Opção 3 - Aula 3            |\n");
            System.out.print("| Opção 4 - Aula 4            |\n");
            System.out.print("| Opção 5 - Aula 5            |\n");
            System.out.print("| Opção 6 - Aula 6            |\n");
            System.out.print("| Opção 7 - Aula 7            |\n");
            System.out.print("| Opção 8 - Aula 8            |\n");
            System.out.print("| Opção 9 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 9) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("\nAula 1");
                    break;

                case 2:
                    System.out.print("\nAula 2\n");
                    break;

                case 3:
                    System.out.print("\nAula 3\n");
                    break;

                case 4:
                    System.out.print("\nAula 4\n");
                    break;

                case 5:
                    System.out.print("\nAula 5\n");
                    RegistroDAlunos.executar();
                    break;

                case 6:
                    System.out.print("\nAula 6\n");
                    System.out.println("\nAinda não implementado\n");
                    break;

                case 7:
                    System.out.print("\nAula 7\n");
                    System.out.println("\nAinda não implementado\n");
                    break;

                case 8:
                    System.out.print("\nAula 8\n");
                    System.out.println("\nAinda não implementado\n");
                    break;

                case 9:
                    System.out.print("\nAula 9\n");
                    System.out.println("\nAinda não implementado\n");
                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }
        }
    }
}

