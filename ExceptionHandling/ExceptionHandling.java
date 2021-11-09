package ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {

		int i = 8, j = 0,k=0;
		
		try {
			
			 k = i / j;
			
		} catch (ArithmeticException e) {
			System.out.println("Number can not be divided by zero");
		}
		System.out.println(k);

	}

}
