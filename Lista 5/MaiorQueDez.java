import java.util.Scanner;

public class MaiorQueDez {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite um numero qualquer: ");
		int var = sc.nextInt();
		
		if(var>10)
		{
			System.out.println("Maior que dez");
		}
		
		else
		{
			System.out.println("Nao e maior que dez");
		}
		
		
	}
}

