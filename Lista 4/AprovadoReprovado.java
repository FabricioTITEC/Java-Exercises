import java.util.Scanner;
public class AprovadoReprovado {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua nota de 0 a 10 : ");
		
		int nota = sc.nextInt();
		
		if(nota>10 || nota <0)
		{
			System.out.println("\nValor Invalido");
		}
		
		if(nota>=6 && nota>0 && nota<=10)
		{
		System.out.println("\nAprovado");
		}
		
		if(nota<=5 && nota>0 && nota<=10)
		{
		System.out.println("\nReprovado");
		}
		
		sc.close();
	}
}

