import java.util.Scanner;
import java.util.Arrays;

public class ExercicioQuatro{
	
	public static void main (String[] args) {
		
			Scanner sc = new Scanner (System.in);
			Scanner sc2 = new Scanner (System.in);
			Scanner sc3 = new Scanner (System.in);
			Scanner sc4 = new Scanner (System.in);
			System.out.print("Digite a quantidade de numeros variaveis que deseja (de 1 a 20): ");
			int position = sc.nextInt();
			int chama [];
			chama = new int [position];
			
			if( position<=20 && position>0){
				
				System.out.print("Digite a partir de qual posicao deseja: ");
				int numero = sc2.nextInt();
				System.out.print("Digite a quantidade de posicoes a ser exibida: ");
				int quant = sc3.nextInt();
				
				if(quant + numero <=position)
				{
					do{
						System.out.print("A quantidade de posicoes e maior que a quantidade de variaveis, por favor digite um numero menor: ");
						int subs = sc4.nextInt();
						quant = (quant*0) + subs;
					}while(quant + numero >= position);

				}
				
				
				for(int i = numero; i<= quant; i++)
				{
					System.out.print(chama[i] +" ");
				}
				
			}
			
			else{
				System.out.println("Numero invalido");
			}
			
		
	}
}
