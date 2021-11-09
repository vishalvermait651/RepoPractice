package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<Integer>();

		values.add(5);
		values.add(6);
		values.add(8);
		values.add(10);
		

		Collections.sort(values);  //ass order
		Collections.reverse(values); //dis order
		
		for (Integer o : values) {
			System.out.println(o);
		}

	}

}