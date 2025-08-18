import java.util.Scanner;
public class Semaforo {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int corSemaforo;

    System.out.println("Digite o número da cor do semáforo  ---> 1 = Verde, 2 = Amarelo, 3 = Vermelho: ");
    corSemaforo = input.nextInt();

    if(corSemaforo == 1 || corSemaforo == 2 || corSemaforo == 3){
        if(corSemaforo == 1){
        System.out.println("Sinal Verde!");
        }
        else if(corSemaforo == 2){
        System.out.println("Sinal Amarelo!");
        }
        else{
            System.out.println("Pare!");
        }
    }
    else{
        System.out.println("Digite um número válido ---> 1 = Verde, 2 = Amarelo, 3 = Vermelho");
    }
    
    


    
    
    
    
    }
    


}