import java.util.Scanner;

public class PositivoNegativo {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite um numero qualquer: ");
		int var = sc.nextInt();
		
		if(var>=0)
		{
			System.out.println("O numero e positivo");
		}
		
		else
		{
			System.out.println("O numero e negativo");
		}
	}
}

