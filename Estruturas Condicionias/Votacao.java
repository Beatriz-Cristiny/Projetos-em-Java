import java.util.Scanner;
public class Votacao {
    public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);
    int idade;

    System.out.println("Digite sua idade: ");
    idade = input.nextInt();

    if(idade >= 16 && idade < 18 || idade > 69){
        System.out.println("Voto facultativo !");
    }
    else if(idade >= 18 && idade <= 69){
        System.out.println("Voto obrigatório !");
    }

    }
}