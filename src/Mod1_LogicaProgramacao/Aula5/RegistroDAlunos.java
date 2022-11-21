package Mod1_LogicaProgramacao.Aula5;

import java.util.Random;
import java.util.Scanner;

//Este programa deve:
//- Ler um vetor "turma" de 5 alunos;
//- Cada registro/objeto de aluno deve ter o número de matrícula do aluno e suas notas de 4 bimestres;
//- Faça um método que imprima a lista de matrícula e notas de cada aluno;
//- Faça um método que tenha como parâmetro um objeto Aluno e retorne a média das 4 notas;
//- Percorra o vetor de alunos e imprima a matrícula e a média calculada (pela função criada) para cada aluno;
public class RegistroDAlunos {
  /*public static void main(String[] args){
        //cadastroAlunos();
    */
    public static void executar(){
        System.out.println("\nNeste módulo aprendi lógica de programação e conceitos básicos de Java \n");
        System.out.println("\nVocê quer executar o método? Use '1' para 'SIM'\n");
        Scanner sc = new Scanner(System.in);
        int condicao = sc.nextInt();
        if (condicao == 1) {
            int[] matriculas = new int[5];
            double[][] notasMatriz = new double[matriculas.length][4];
            cadastroAlunos(matriculas, notasMatriz);
            printMatriculaNotas(matriculas, notasMatriz);
        }
    }
    public static double mediaNotas(double[] notas){
        double media = 0;
        for (int j = 0; j < notas.length; j++){
            media += notas[j];
        }
        return media / notas.length;
    }
    public static void cadastroAlunos(int[] matriculas, double[][] notas){
        Random rand = new Random();

        for (int i = 0; i < matriculas.length; i++){
            matriculas[i] = rand.nextInt(1000, 9999);
        }
        for (int i = 0; i < matriculas.length; i++){
            double[] atual = notas[i];
            for (int j = 0; j < atual.length; j++){
                atual[j] = rand.nextDouble(5, 10);
            }
        }
    }
    public static void printMatriculaNotas(int[] matriculas, double[][] notas){
        for (int i = 0; i < matriculas.length; i++){
            System.out.print(i + 1 + "º matrícula: " + matriculas[i] + " -> ");
            for (int j = 0; j < notas[i].length; j++){
                System.out.printf("%.1f | ", notas[i][j]);
            }
            System.out.println(" Média: " + String.format("%.1f", mediaNotas(notas[i])));
        }
    }
}


