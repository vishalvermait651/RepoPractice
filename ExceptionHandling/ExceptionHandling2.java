package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling2 {

	public static void main(String[] args) throws Exception {

		int i = 8, k = 0, j = 1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // getting input from user

		System.out.println("Enter your Number");

		try {
			j = Integer.parseInt(br.readLine());
			k = i / j;

		} catch (IOException e) {
			System.out.println("Some IO Error");
		} catch (ArithmeticException e) {
			System.out.println("can't divide by zero");
		} catch (Exception e) {
			System.out.println("Unknown Exception");
		} finally {
			br.close();
			System.out.println("Bye");
		}
		System.out.println(k);
	}

}
