package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapp {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Rajul");
		map.put(2, "Arshit");
		map.put(3, "Bhakti");
		map.put(4, "Roshani");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
