
public class OperadoresLogicos {
	
	public static void main (String[] args) {
		//true, true, false, false e true nessa ordem
		
			int a = 1;
			int b = 2;
			int c = 3;
			int d = 4;
		
			System.out.println(a > b | c < d);
			System.out.println(a > b || c < d);
			System.out.println(a > b & c < d);
			System.out.println(a > b && c < d);
			System.out.println(a > b ^ c < d);
	}
}

