package Mod1_LogicaProgramacao.Lesson4;

import java.util.Scanner;
/* Vetores e matrizes na Linguagem Java
Faça um programa que imprima uma matriz quadrada de dimensão N contendo:
º o número 1 nos elementos abaixo da diagonal principal
º o número 0 nos demais elementos.
º N deve ser menor ou igual a 20.
*/
public class Test12_Matrix {
    public static void main(String[] args) {

        System.out.println("Informe o índice da matriz, entre 0 e 20.");

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matriz = new int[N][N];

        if (N > 20 || N < 2) {
            System.out.println("O valor não é válido");
        } else {
            int[][] triangleMatriz = retornaTriangulo(matriz);
            printMatriz(triangleMatriz);
            System.out.println("___");
            System.out.println(matrizToString(triangleMatriz));

            System.out.println("Usando o método 2");
            definirTriangulo2(matriz);
            printMatriz(matriz);
            System.out.println("___");
            System.out.println(matrizToString(matriz));
        }
    }
    public static void printMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            int[] ints = matriz[i];
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Esse método cria um texto com a formatação quadrática de uma matriz.
     * @param matriz matriz de inteiros que será usada como argumento.
     * @return nova matriz resultante.
     */
    public static String matrizToString(int[][] matriz){
        String teste = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                teste +=(matriz[i][j] + " ");
            }
            teste+="\n";
        }
        return teste;
    }

    /**
     * Esse método gera uma nova matriz, sem alterar a matriz original.
     * SHIFT + F6 = ATUALIZA TODOS OS NOMES SEMELHANTES.
     * @param matriz esse método define a matriz m com retorno não-nulo.     * @return
     */
    public static int[][] retornaTriangulo(int[][] matriz){
        int [][] m = new int [matriz.length][matriz[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i > j) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                }
            }
        }
        return m;
    }
    public static void definirTriangulo2(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
    }
}