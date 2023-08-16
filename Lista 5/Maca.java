import java.util.Scanner;

public class Maca {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite o numero de macas que deseja comprar: ");
		int q = sc.nextInt();
		double compra;
		
		if(q>0 && q<12)
		{
			compra = q*1.30;
			System.out.print("O valor da compra e de R$"+ compra);
		}
		
		if(q>=12)
		{
			compra = q*1;
			System.out.print("O valor da compra e de R$"+ compra);
		}
		
		if(q<=0)
		{
			System.out.print("Quantidade invalida");
		}
		
		
	}
}

