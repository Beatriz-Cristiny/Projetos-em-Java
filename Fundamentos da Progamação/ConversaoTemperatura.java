import java.util.Scanner;
public class ConversaoTemperatura
{
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		double celsius , kelvin;
		final double CONSTANTE = 273.15;
		
		
		System.out.print("temperatura em celsius: ");
		celsius = input.nextDouble();
		
		kelvin = celsius + CONSTANTE;
		
		System.out.println("A temperatura em kelvin é:  " + kelvin);
		
	}
}
