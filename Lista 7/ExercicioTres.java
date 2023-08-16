import java.util.Scanner;
import java.util.Arrays;

public class ExercicioTres {
	
	public static void main (String[] args) {
		
			Scanner sc = new Scanner (System.in);
			Scanner sc2 = new Scanner (System.in);
			System.out.print("Digite um numero de 0 a 20: ");
			int position = sc.nextInt();
			int chama [];
			chama = new int [position];
			
			if( position<=20 || position>0){
				
				System.out.print("Digite a quantidade de posicoes a ser exibida: ");
				int numero = sc2.nextInt();
				for(int i = 0; i<=numero ; i++)
				{
					System.out.print(chama[i] +" ");
				}
				
			}
			
			else{
				System.out.println("Numero invalido");
			}
			
		
	}
}

