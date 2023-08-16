import java.util.Scanner;

public class Votar {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o ano que voce nasceu: ");
		int nascimento = sc.nextInt();
		nascimento = 2023 - nascimento;
		
		if(nascimento>=16)
		{
			System.out.println("Voce pode votar este ano");
		}
		
		else
		{
			System.out.println("Voce nao pode votar esse ano");
		}
		
		
	}
}

