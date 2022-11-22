package Mod1_LogicaProgramacao.Aula1;

import java.util.Scanner;

public class MenuAula1 {

    public static void menuA1() {

        Scanner menu = new Scanner (System.in);

        while (true) {

            System.out.print("##----------Menu da Aula 1----------##\n\n");
            System.out.print("|----------------------------------|\n");
            System.out.print("| Opção 1 - Exercício 1.1            |\n");
            System.out.print("| Opção 2 - Exercício 2.1            |\n");
            System.out.print("| Opção 3 - Sair                   |\n");
            System.out.print("|----------------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 3) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("\nExercício 1");
                    Exercício1_1_1.cadastroPessoa();
                    break;

                case 2:
                    System.out.print("\nExercício 2\n");
                    Exercício2_1_1.comparaNumeros();
                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }
        }
    }
}
