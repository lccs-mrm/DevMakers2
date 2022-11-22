package Mod1_LogicaProgramacao;

import Mod1_LogicaProgramacao.Aula1.MenuAula1;
import Mod1_LogicaProgramacao.Aula2.MenuAula2;
import Mod1_LogicaProgramacao.Aula3.MenuAula3;
import Mod1_LogicaProgramacao.Aula4.MenuAula4;
import Mod1_LogicaProgramacao.Aula5.MenuAula5;

import java.util.Objects;
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
            System.out.print("| Opção 7 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 7) {
                break;
            }

            System.out.println("\nNeste módulo aprendi lógica de programação e conceitos básicos de Java \n");
            System.out.println("\nVocê quer executar o método? 'y' ou 'n'\n");
            Scanner sc = new Scanner(System.in);
            int condicao = sc.nextInt();
            if (Objects.equals(condicao, "y)")) {

                switch (opcao) {
                    case 1:
                        System.out.print("\nAula 1");
                        MenuAula1.menuA1();
                        break;

                    case 2:
                        System.out.print("\nAula 2\n");
                        MenuAula2.menuA2();
                        break;

                    case 3:
                        System.out.print("\nAula 3\n");
                        MenuAula3.menuA3();
                        break;

                    case 4:
                        System.out.print("\nAula 4\n");
                        MenuAula4.menuA4();
                        break;

                    case 5:
                        System.out.print("\nAula 5\n");
                        MenuAula5.menuA5();
                        break;

                    case 6:
                        System.out.print("\nAula 6\n");
                        System.out.println("\nAinda não implementado\n");
                        break;

                    default:
                        System.out.print("\nOpção Inválida!");
                        break;
                }
            }
        }
    }
}

