/*

Obter quant horas diurnas       10
Obter quant horas noturnas       4

valor salario diurno = quant horas diurnas * 10         100
valor salario noturno = quant horas noturnas * 10 * 1,5  60
valor total salario = valor salario diurno + valor salario noturno  160

escrever valor salario diurno           100
escrever valor salario noturno          60
escrever valor tota salario             160


*/


import java.util.Scanner;
public class ValorSalario
{
	public static void main(String[] args) {
            
            // Declarações
            Scanner input = new Scanner(System.in);
            
            final double VALOR_HORA = 10.37;
            final double ADICIONAL_NOTURNO = 1.5;
            
            double horasDiurnas, horasNoturnas;
            double salarioDiurno, salarioNoturno, salarioTotal;
            
            // Entradas
            System.out.print("Horas trabalhadas - diurno : ");
            horasDiurnas = input.nextDouble();
            System.out.print("Horas trabalhadas - noturno: ");
            horasNoturnas = input.nextDouble();
            
            // Processamentos
            salarioDiurno = horasDiurnas * VALOR_HORA;
            salarioNoturno = horasNoturnas * VALOR_HORA * ADICIONAL_NOTURNO;
            salarioTotal = salarioDiurno + salarioNoturno;
            
            // Saídas
            System.out.println("Salário diurno : R$ " + salarioDiurno);
            System.out.println("Salário noturno: R$ " + salarioNoturno);
            System.out.println("Salário total  : R$ " + salarioTotal);
	
	}
}
