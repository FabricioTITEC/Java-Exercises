
public class VerificaValorProdutoRandom {
	
	public static void main (String[] args) {
		
		int produto1 = (int) (Math.random()*1000);
		int produto2 = (int) (Math.random()*1000);
		
		if(produto1 > produto2)
		{
			System.out.println("O produto 2 e o mais barato custando: " + produto2 + "\nenquanto o produto 1 custa: " + produto1);
		}
		
		if(produto1<produto2)
		{
			System.out.println("O produto 1 e o mais barato custando: " + produto1 + "\nenquanto o produto 2 custa: " + produto2);
		}
		
		if(produto1==produto2)
		{
			System.out.println("Os produtos tem o mesmo valor");
		}
	}
}

