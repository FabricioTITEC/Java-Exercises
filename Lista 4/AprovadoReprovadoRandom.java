
public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
		
		int nota = (int)(Math.random()*10);
		
		if(nota>=6)
		{
		System.out.println(nota + " Aprovado");
		}
		
		if(nota<=5)
		{
		System.out.println(nota + " Reprovado");
		}
		
	}
}

