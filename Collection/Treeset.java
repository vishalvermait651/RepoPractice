package Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {

		Set<Integer> values = new TreeSet<Integer>();  // get values in seuqnce using treeset

		values.add(5);
		values.add(6);
		values.add(18);
		values.add(10);

		for (int i : values) {
			System.out.println(i);
		}

	}

}
