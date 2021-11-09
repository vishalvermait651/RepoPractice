package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Generics {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<Integer>();

		values.add(5);
		values.add(6);
		values.add(8);
		values.add(10);
		values.add(2, 2); // adding 2 before 8 and 10 using List and for loop

		for (Integer o : values) {
			System.out.println(o);
		}

	}

}