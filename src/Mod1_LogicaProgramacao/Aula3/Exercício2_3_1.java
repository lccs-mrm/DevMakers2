package Mod1_LogicaProgramacao.Aula3;

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
public class Exercício2_3_1 {
    /**
     * Nesta classe o usuário informa um produto e seu preço;
     * Então é perguntado se quer informar um novo produto;
     * Por fim, um laço "do while" com a condição de informar um novo produto aninha um laço "if else";
     * O laço "if else" compara as variáveis informadas e armazena o produto mais caro e o mais barato;
     * Quando o laço "do while" é encerrado, a classe imprime os dois produtos, mais caro e mais barato.
     */
    public static void compara2Precos(){
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
