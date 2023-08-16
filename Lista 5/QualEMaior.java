import java.util.Scanner;

public class QualEMaior {
	
	public static void main (String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Digite um numero qualquer: ");
		int var1 = sc1.nextInt();
		System.out.print("Digite um numero qualquer diferente do anterior: ");
		int var2 = sc1.nextInt();
		
		if(var1==var2)
		{
			System.out.println("Os numeros precisam ser diferentes");
		}
		
		if(var1>var2)
		{
			System.out.println("O numero " + var1 + " e maior");
		}
		
		if(var2>var1)
		{
			System.out.println("O numero " + var2 + " e maior");
		}
	}
}

