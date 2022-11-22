package Mod1_LogicaProgramacao.Aula5;

import java.util.Random;

/*Este programa deve:
Ler um vetor "turma" de 5 alunos;
Cada registro/objeto de aluno deve ter o número de matrícula do aluno e suas notas de 4 bimestres;
Faça um método que imprima a lista de matrícula e notas de cada aluno;
Faça um método que tenha como parâmetro um objeto Aluno e retorne a média das 4 notas;
Percorra o vetor de alunos e imprima a matrícula e a média calculada (pela função criada) para cada aluno;
*/
public class Exercício1_5_1 {
  /*public static void main(String[] args){
        cadastroAlunos();
    */

    /**
     * Aqui é aberta a classe onde será gerada uma matriz contendo:
     * 5 nº de matrícula. O valor pode ser alterado.
     * 4 notas. O valor pode ser alterado.
     * média final.
     */
    public static void registroDAlunos(){

        int[] matriculas = new int[5];
        double[][] notasMatriz = new double[matriculas.length][4];
        cadastroAlunos(matriculas, notasMatriz);
        printMatriculaNotas(matriculas, notasMatriz);
        }

    /**
     * Aqui é calculada a média das notas do aluno.
     * @param notas armazena as notas geradas para o aluno.
     * @return media das notas do aluno.
     */
    public static double mediaNotas(double[] notas){
        double media = 0;
        for (int j = 0; j < notas.length; j++){
            media += notas[j];
        }
        return media / notas.length;
    }

    /**
     * Aqui é gerado um número aleatório para as matrículas.
     * @param matriculas gerado randomicamente pelo método rand.
     * @param notas geradas automaticamente também.
     */
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

    /**
     * Aqui é percorrida a matriz que contem matrícuals e notas produzidas no método "cadastroAlunos".
     * Na sequência é impressa a matriz contendo tanto a matrícula quanto a nota e a média.
     */
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


