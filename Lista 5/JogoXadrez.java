import java.util.Scanner;

public class JogoXadrez {
	
	public static void main (String[] args) {
		
		Scanner sc1 = new Scanner (System.in);
		Scanner sc2 = new Scanner (System.in);
		
		System.out.print("Digite a hora de inicio do jogo: ");
		int horai = sc1.nextInt();
		System.out.print("Digite a hora do fim do jogo: ");
		int horaf = sc2.nextInt();
		int quant;
		if( horai>23 || horai<0 || horaf>23 || horaf<0)
		{
			System.out.println("Hora invalida");
		}
		
		if( horai<=23 && horai>=0 && horaf<=23 && horaf>=0)
		{
			if(horai==horaf)
			{
				System.out.println("A duracao do jogo foi de 24 horas");
			}
			
			if(horai>horaf)
			{
				
			horai = 24 - horai;
			horai += horaf;
			System.out.println("A duracao do jogo foi de " + horai);
			}
			
			if(horai<horaf)
			{
			horaf -=horai;
			System.out.println("A duracao do jogo foi de " + horaf);
			}
			

		}
	}
}

