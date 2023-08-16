import java.util.Scanner;

public class Saudacao {
	
	public static void main (String[] args) {
		
		Scanner sc1 = new Scanner (System.in);
		Scanner sc2 = new Scanner (System.in);
		
		System.out.print("Digite 1 para informar as horas ou digite 2 para gerar aleatoriamente: ");
		int selecao = sc1.nextInt();
		
		if(selecao==1)
		{
			System.out.print("Digite a hora: ");
			int hora = sc2.nextInt();
			
			if(hora>=0 && hora<=6)
			{
				System.out.println("Zzzz");
			}
			
			if(hora>=7 && hora<=11)
			{
				System.out.println("Bom dia");
			}
			
			if(hora>=12 && hora<=17)
			{
				System.out.println("Boa tarde");
			}
			
			if(hora>=18 && hora<=23)
			{
				System.out.println("Boa noite");
			}
		}
		
		if(selecao==2)
		{
			int hora = (int)(Math.random()*23);
			
			if(hora>=0 && hora<=6)
			{
				System.out.println("Zzzz");
			}
			
			if(hora>=7 && hora<=11)
			{
				System.out.println("Bom dia");
			}
			
			if(hora>=12 && hora<=17)
			{
				System.out.println("Boa tarde");
			}
			
			if(hora>=18 && hora<=23)
			{
				System.out.println("Boa noite");
			}
		}
		
		if(selecao!=1 && selecao!=2)
		{
			System.out.println("Opcao invalida");
		}
	}
}

