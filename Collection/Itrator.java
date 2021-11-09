package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Itrator {

	public static void main(String[] args) {

		Collection values = new ArrayList();

		values.add(5);
		values.add(6);
		values.add(10);

		Iterator it = values.iterator();

		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());

	}

}
