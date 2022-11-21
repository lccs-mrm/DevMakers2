import Mod1_LogicaProgramacao.Lesson5.Teste13_StudentsRegister;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner menu = new Scanner (System.in);

        while (true) {

            System.out.print("##------------Menu do Projeto #DevMakers_2-------------##\n\n");
            System.out.print("|---------------------------------------------------------|\n");
            System.out.print("| Opção 1 - Módulo 1 - Lógica de Programação              |\n");
            System.out.print("| Opção 2 - Módulo 2 - Programação Orientada a Objetos 1  |\n");
            System.out.print("| Opção 3 - Módulo 3 - Programação Orientada a Objetos 2  |\n");
            System.out.print("| Opção 4 - Módulo 4 - Banco de Dados SQL                 |\n");
            System.out.print("| Opção 5 - Módulo 5 - Técnicas de Programação 1          |\n");
            System.out.print("| Opção 6 - Módulo 6 - Programação Web 2                  |\n");
            System.out.print("| Opção 7 - Módulo 7 - Testes Automatizados 1             |\n");
            System.out.print("| Opção 8 - Sair                                          |\n");
            System.out.print("|---------------------------------------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 8) {
                System.out.print("\nAté logo!");
                menu.close();
            }

            switch (opcao) {
                case 1:
                    System.out.print("\nOpção Módulo 1 - Lógica de Programação");
                    break;

                case 2:
                    System.out.print("\nOpção Módulo 2 - Programação Orientada a Objetos 1\n");
                    break;

                case 3:
                    System.out.print("\nOpção Programação Orientada a Objetos 2\n");
                    break;

                case 4:
                    System.out.print("\nOpção Banco de Dados SQL\n");
                    break;

                case 5:
                    System.out.print("\nOpção Técnicas de Programação 1\n");
                    break;

                case 6:
                    System.out.print("\nOpção Programação Web 2\n");
                    break;

                case 7:
                    System.out.print("\nOpção Testes Automatizados 1\n");
                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }
        }
    }
}