/* Como caixa da lanchonete gostaria de um programa para 
   dividir o valor da conta pela quantidade de pessoas que 
   consumiram o lanche.

Algoritmo
=========
obter o valor do lanche  (200,00)

obter a quantidade de pessoas (4)

valor por pessoa = valor do lanche / quantidade pessoas
     (50,00)              (200,00)      (4)

mostrar valor por pessoas  (50,00)
*/

public class Lanchonete
{
	public static void main(String[] args) {
		
		// Entradas
		double valorConta = 200.00;
		int qtdePessoas = 4;
		
		// Processamento
		double valorPorPessoa = valorConta / qtdePessoas;
		
		// Saída
		System.out.println("Valor a pagar por Ppessoa: R$ " + valorPorPessoa);
		
	}
}