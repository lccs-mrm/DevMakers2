package Mod1_LogicaProgramacao.Lesson3;

import java.util.Scanner;
/*
Exercício: Crie um programa que receba nomes e preços de produtos e depois no final mostre qual o produto mais caro e o mais barato.

Entradas:

Nome e preço do produto
Finalizar operação
Saida:

Nome e preço do produto mais caro
Nome e preço do produto mais barato
 */
public class Test10 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String produto = "";
        double preco = 0.0;
        String produtoBarato = "";
        String produtoCaro = "";
        double precoBarato = 0.0;
        double precoCaro = 0.0;
        int quantidade = 0;
        String condicao = "s";

        do{
            System.out.println("Por favor, informe o produto e o preço:");
            produto = sc.next();
            preco = sc.nextDouble();
            if (quantidade == 0){
                produtoBarato = produto;
                produtoCaro = produto;
                precoBarato = preco;
                precoCaro = preco;
            } else{
                if (preco < precoBarato){
                    precoBarato = preco;
                    produtoBarato = produto;
                }
                if (preco > precoCaro){
                    precoCaro = preco;
                    produtoCaro = produto;
                }
            }
            quantidade++;
            System.out.println("Deseja informar mais algum produto? (s/n)");
            condicao = sc.next();
        } while(condicao.equals("s"));
        sc.close();
        System.out.println("O produto mais caro é " + produtoCaro + " e custa R$" + precoCaro);
        System.out.println("O produto mais barato é " + produtoBarato + " e custa R$" + precoBarato);
    }
}
