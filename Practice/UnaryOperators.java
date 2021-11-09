package Practice;

public class UnaryOperators {

	public static void main(String[] args) {

		int a = 20;
		int b = 10;
		System.out.println(a++ + ++b); // 20+11=31
		System.out.println(++a);
		System.out.println(b++);

		System.out.println(~b);
		System.out.println(~a);

	}
}

