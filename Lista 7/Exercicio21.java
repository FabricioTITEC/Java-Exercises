import java.util.Scanner;
import java.util.Arrays;

public class Exercicio21 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int [] AB;
		AB = new int [10];
		
		int pt;
		
	
			for(int i = 0; i<=9; i++){
				System.out.println("Digite um numero qualquer: ");
				AB[i] = sc.nextInt();
				if(AB[i]%2!=0){
					AB[i]*=2;
				}
			}
			
		
		
		
		System.out.println(Arrays.toString(AB));
	}
}

