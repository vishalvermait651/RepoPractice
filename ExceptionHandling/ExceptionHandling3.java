package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Practice.ArithmaticOpearion;

public class ExceptionHandling3 {

	public static void main(String[] args) throws ArithmeticException, NumberFormatException, IOException {
		int i = 8, k = 0, j = 1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // getting input from user

		try {
			System.out.println("Enter your Number");
			j = Integer.parseInt(br.readLine());
			k = i + j;

			if (k < 10) {
				throw new ArithmeticException();
			}
			System.out.println("output is" + k);
		} catch (ArithmeticException e) {
			System.out.println("Min value for output is 10");
		}

	}

}
