// Escreva um programa para receber o preço de custo e o preço de venda de um produto.
// Calcular e mostrar o valor do lucro.

import java.util.Scanner;
public class ValorLucro {
    public static void main(String[] args) {
        //declaração das variáveis

        Scanner input = new Scanner(System.in);
        double custo, valorVenda , lucro;

        //enteada de dados

        System.out.print("Digite o custo do produto: ");
        custo= input.nextDouble();
        System.out.print("valor de venda: ");
        valorVenda= input.nextDouble();

        //processamento

        lucro= valorVenda - custo;

        //saida
        
        System.out.println("O Lucro foi de: " + lucro);
    }
}