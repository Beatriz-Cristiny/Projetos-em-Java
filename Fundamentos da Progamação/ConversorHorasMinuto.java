import java.util.Scanner;
public class ConversorHorasMinuto {
    public static void main(String[] args) {
        
        //declaracao das variais

        Scanner input = new Scanner(System.in);
        double quantidadeHoras , segundos , minutos;

        //entrada de dados

        System.out.println("Quantidade de horas: ");
        quantidadeHoras= input.nextDouble();
        
        //processamento
        
        minutos = quantidadeHoras * 60;
        segundos= quantidadeHoras * 3600;
        
        //saida de dados

        System.out.println("tem " + minutos + " minutos e " + segundos + " segundos");

}

}