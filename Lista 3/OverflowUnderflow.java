

public class OverflowUnderflow {
	
	public static void main (String[] args) {
		System.out.println( (long) -2147483649L + 1);
		System.out.println( (long)  2147483648L - 1);
	}
}

