package Practice;

public class SwitchAndBreak {

	public static void main(String[] args) {

		int n = 1;
		int x = 2;

		switch (n) {

		case 1:
			System.out.println("one");
			break;

		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		}

		if (x == 1)

		{
			System.out.println("zero");
		} else if (x == 1) {
			System.out.println("one");
		} else if (x == 2) {
			System.out.println("two");
		} else if (x == 3) {
			System.out.println("three");
		} else if (x == 4) {
			System.out.println("four");
		} else if (x == 5) {
			System.out.println("five");
		} else if (x == 6) {
			System.out.println("six");

		}

		while (n < 3) {
			System.out.println("hii");
			n++;
			break;
	
		}
	}
}