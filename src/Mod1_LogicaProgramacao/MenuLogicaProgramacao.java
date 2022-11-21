package Mod1_LogicaProgramacao;

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
            System.out.print("| Opção 6 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 4) {
                System.out.print("\nAté logo!");
                menu.close();
            }

            switch (opcao) {
                case 1:
                    System.out.print("\nOpção Novo Cadastro Selecionado");
                    break;

                case 2:
                    System.out.print("\nOpção Clientes Selecionado\n");
                    break;

                case 3:
                    System.out.print("\nOpção Produtos Selecionado\n");
                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }
        }
    }
}

