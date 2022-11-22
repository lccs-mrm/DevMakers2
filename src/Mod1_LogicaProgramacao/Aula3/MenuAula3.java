package Mod1_LogicaProgramacao.Aula3;

import java.util.Scanner;

public class MenuAula3 {

    public static void menuA3() {

        Scanner menu = new Scanner (System.in);

        while (true) {

            System.out.print("##----------Menu da Aula 3----------##\n\n");
            System.out.print("| Opção 1 - Exercício 1.3            |\n");
            System.out.print("| Opção 2 - Exercício 2.3            |\n");
            System.out.print("| Opção 3 - Exercício 3.3            |\n");
            System.out.print("| Opção 4 - Sair                   |\n");
            System.out.print("|----------------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 4) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("\nExercício 1");
                    Exercício1_3_1.calcula2Numeros();
                    break;

                case 2:
                    System.out.print("\nExercício 2\n");
                    Exercício2_3_1.compara2Precos();
                    break;

                case 3:
                    System.out.print("\nExercício 3\n");
                    Exercício3_3_1.trianguloAsteriscos();
                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }
        }
    }
}

