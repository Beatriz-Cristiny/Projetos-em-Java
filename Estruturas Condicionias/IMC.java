import java.util.Scanner;
public class IMC
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double imc, altura, peso;
		
        System.out.println("Digite sua Altura: ");
        altura = input.nextDouble();

        System.out.println("Digite seu peso: ");
        peso = input.nextDouble();

        imc = peso / (altura * altura);

		if(imc >= 30){
            System.out.println("Consulte um endocrinologista");
        }
			
	}
}
