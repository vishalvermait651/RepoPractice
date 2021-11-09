package Practice;

public class IfElseIfStatement {

	public static void main(String[] args) {

		String city = "yz";
		int x = 2;

		if (city == "baroda") {
			System.out.println("city is baroda");
		} else if (city == "surat") {
			System.out.println("city is surat");
		} else if (city == "anand") {
			System.out.println("city is anand");
		} else {
			System.out.println(city);
		}

		if (x == 0) {
			System.out.println("sunday");
		} else if (x == 1) {
			System.out.println("monday");
		} else if (x == 2) {
			System.out.println("tuesday");
		} else if (x == 3) {
			System.out.println("wednesday");
		} else if (x == 4) {
			System.out.println("thursday");
		} else if (x == 5) {
			System.out.println("friday");
		} else if (x == 6) {
			System.out.println("saturday");

		}
	}
}