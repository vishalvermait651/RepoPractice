package Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Hashsett {

	public static void main(String[] args) {

		Set<Integer> values = new HashSet<Integer>();

		values.add(5);
		values.add(6);
		values.add(8);
		values.add(6);   // can't get doublicate values

		for (int i : values) {
			System.out.println(i);
		}

	}

}
