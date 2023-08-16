import java.util.Scanner;

public class VerificaValorProduto {
	
	public static void main (String[] args) {
		
		Scanner p1 = new Scanner (System.in);
		Scanner p2 = new Scanner (System.in);
		
		System.out.print("Digite o valor do produto 1 (Valor menor que mil reais): ");
		int produto1 = p1.nextInt();
		System.out.print("Digite o valor do produto 2 (Valor menor que mil reais): ");
		int produto2 = p2.nextInt();
		
		if(produto1>0 && produto2>0 && produto1<=1000 && produto2<=1000)
		{
			if(produto1>produto2)
			{
				System.out.println("O produto 1 e mais caro");
			}
			if(produto1<produto2)
			{
				System.out.println("O produto 2 e mais caro");
			}
			if(produto1==produto2)
			{
				System.out.println("Os produtos tem o mesmo preco");
			}
		}
		
		else
		{System.out.print("Numero Invalido");}
	}
}

