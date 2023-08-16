import java.util.Scanner;
import java.util.Arrays;

public class Exercicio22 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int AC [];
		int ar;
		
		do{
			System.out.print("Digite um numero entre 0 e 20: ");
			ar = sc.nextInt();
		}while(ar<=0 || ar>20);
		
		AC = new int [ar];
		System.out.println(Arrays.toString(AC));
		
		
	}
}

