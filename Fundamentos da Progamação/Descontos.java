// Escreva um programa para receber o preço de um produto e o percentual de desconto concedido.
// Calcular e mostrar:
// Valor do desconto (preço do produto * percentual de desconto / 100)
// Preço do produto com desconto (preço do produto - valor do desconto)


import java.util.Scanner;
public class Descontos {
  public static void main(String[] args) {

    //declaracao

    Scanner input =  new Scanner(System.in);
    double precoProduto , percentualDesconto,valorComDesconto,
    desconto;
    final double PORCENTAGEM = 100;
    
    //entrada

    System.out.println("digite o valor do produto: ");
    precoProduto = input.nextDouble();

    System.out.println("digite o percentual de desconto:");
    percentualDesconto = input.nextDouble();

    //processamento
    
    desconto = precoProduto * percentualDesconto / PORCENTAGEM;
    valorComDesconto = precoProduto - desconto;

    //saida

    System.out.println("o valor do desconto é: " + desconto);

    System.out.println("o valor do produto com desconto é: " + 
    valorComDesconto);
    

  }

}

