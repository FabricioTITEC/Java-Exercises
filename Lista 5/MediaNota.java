import java.util.Scanner;

public class MediaNota{
	
	public static void main (String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Digite a nota de 0 a 10 da sua primeira prova: ");
		int nota1 = sc1.nextInt();
		System.out.print("Digite a nota de 0 a 10 da sua segunda prova: ");
		int nota2 = sc2.nextInt();
		
		int media = (nota1+nota2)/2;
		
		if(media>=6 && nota1>=0 && nota1<=10 && nota2>=0 && nota2<=10)
		{
			System.out.println("Voce foi aprovado e sua media e "+ media);
		}
		
		if(media<6 && nota1>=0 && nota1<=10 && nota2>=0 && nota2<=10)
		{
			System.out.println("Voce foi reprovado e sua media e "+ media);
		}
		
		if(media<0 || media>10 || nota1<0 || nota1>10 || nota2<0 || nota2>10)
		{
			System.out.println("Numeros digitados invalidos");
		}
		
	}
}

