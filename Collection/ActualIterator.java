package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ActualIterator {

	public static void main(String[] args) {

		Collection values = new ArrayList();

		values.add(5);
		values.add(6);
		values.add(10);

		Iterator it = values.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());  //how to put all the values to gether... we have to use while loop.
		}

	}

}
