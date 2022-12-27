import Mod1_LogicaProgramacao.MenuLogicaProgramacao;
import Mod2_ObjectOrientedProgramming1.MenuOOP1;
import Mod3_ObjectOrientedProgramming2.MenuOOP2;
import Mod4_DataBaseSQL.MenuDB_SQL;
import Mod5_ProgrammingTechniques1.MenuPT1;
import Mod6_WebProgramming2.MenuWP2;
import Mod7_AutomatedTests1.MenuAT1;

import java.util.Scanner;

/**
 * @author lucavicchi
 * @version 1.0.0
 * Registro de estudo do curso de Back-end na Ada from Let's Code
 * segue anotações de documentação;
 */
/*
@author - nome do desenvolvedor;

@deprecated - marca o método como deprecated. Algumas IDE's exibirão um alerta de compilação quando o método for chamado;

@exception - documenta uma exceção lançada por um método - veja também @throws;

@param - define um parâmetro do método. Requerido para cada parâmetro.

@return - documenta o valor de retorno. Essa tag não deve ser usada para construtores ou métodos definidos com o tipo de retorno void.

@see - documenta uma associação a outro método ou classe.

@Since - documenta uma exceção lançada por um método. É um sinônimo para a @exception introduzida no Javadoc 1.2;

@version - exibe o número da versão de uma classe ou método.
 */
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
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\nOpção Módulo 1 - Lógica de Programação \n");
                    MenuLogicaProgramacao.menuLogica();
                    break;

                case 2:
                    System.out.println("\nOpção Módulo 2 - Programação Orientada a Objetos 1\n");
                    System.out.println("\nAinda não implementado\n");
                    MenuOOP1.menuOOP1();
                    break;

                case 3:
                    System.out.println("\nOpção Programação Orientada a Objetos 2\n");
                    System.out.println("\nAinda não implementado\n");
                    MenuOOP2.menuOOP2();
                    break;

                case 4:
                    System.out.println("\nOpção Banco de Dados SQL\n");
                    System.out.println("\nAinda não implementado\n");
                    MenuDB_SQL.menuDB();
                    break;

                case 5:
                    System.out.println("\nOpção Técnicas de Programação 1\n");
                    System.out.println("\nAinda não implementado\n");
                    MenuPT1.menuTecnicas();
                    break;

                case 6:
                    System.out.println("\nOpção Programação Web 2\n");
                    System.out.println("\nAinda não implementado\n");
                    MenuWP2.menuWeb();
                    break;

                case 7:
                    System.out.println("\nOpção Testes Automatizados 1\n");
                    System.out.println("\nAinda não implementado\n");
                    MenuAT1.menuTAutomatizados();
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
                    break;
            }
        }
    }
}