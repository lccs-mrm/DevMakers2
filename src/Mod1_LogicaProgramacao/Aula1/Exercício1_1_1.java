package Mod1_LogicaProgramacao.Aula1;

import java.util.Scanner;

public class Exercício1_1_1 {
/*
O propósito desta atividade é treinar a sintaxe do Scanner e o armazenamento de variáveis.
 */
    /**
     * Esta função vai armazenar o cadastro de 1 pessoa;
     * O cadastro contém nome, endereço, telefone, cidade e CEP;
     * Ao final serão exibidas essas informações.
     */
    public static void cadastroPessoa(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = sc.nextLine();

        System.out.println("Digite seu endereço");
        String endereco = sc.nextLine();

        System.out.println("Digite seu telefone");
        int telefone = sc.nextInt();

        System.out.println("Digite a cidade onde você mora");
        String cidade = sc.nextLine();

        System.out.println("Digite seu CEP");
        int cep = sc.nextInt();

        System.out.println("Meu nome é " + nome);
        System.out.println("Moro na " + endereco);
        System.out.println("Meu telefone é" + telefone);
        System.out.println("Moro na cidade " + cidade);
        System.out.println("Meu CEP é " + cep);

        sc.close();
    }
}
