package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ValuesSeuential {

	public static void main(String[] args) {

		List values = new ArrayList();

		values.add(5);
		values.add(6);
		values.add(8);
		values.add(10);
		values.add(2, 2);    // adding 2 before 8 and 10 using List and for loop


		for (int i=0;i<values.size();i++) {
			System.out.println(values.get(i));
		}

	}

}
