import java.util.Scanner;

public class ADivisivelPorB {
	
	public static void main (String[] args) {
		
		Scanner va = new Scanner(System.in);
		Scanner vb = new Scanner(System.in);
		
		System.out.print("Digite o valor de 0 a 1000: ");
		int n1 = va.nextInt();
		System.out.print("Digite o valor de 0 a 20: ");
		int n2 = vb.nextInt();
		
		if(n1>0 && n1<=1000 && n2>0 && n2<=20 && n1%n2==0)
		{
			System.out.println(n1 + " e divisivel por " + n2);
		}
		
		if(n1>0 && n1<=1000 && n2>0 && n2<=20 && n1%n2!=0)
		{
			System.out.println(n1 + " nao e divisivel por " + n2); 
		}
		
		if(n1<0 || n1>1000 || n2<0 || n2>20)
		{
			System.out.println("Numero invalido");
		}	
	}
}

