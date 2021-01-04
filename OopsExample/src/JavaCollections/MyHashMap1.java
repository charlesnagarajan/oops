package JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MyHashMap1 {

	public static void main(String[] args) {

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("charls", 200);
		hmap.put("don", 201);
		hmap.put("karupu", 203);
		hmap.put("vino", 204);
		hmap.put("kutty", 205);
		hmap.put("mukil", 206);
		hmap.put("1", 1000);
		hmap.put("a", new Integer(1));
		hmap.put("b", new Integer(2));
		hmap.put("c", new Integer(3));
		hmap.remove("charls");
		System.out.println(hmap);

		System.out.println(hmap);

		for (int i = 0; i < hmap.size(); i++) {
			System.out.println(hmap.get(String.valueOf(i)));
		}

		Iterator it = hmap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + "" + pair.getValue());
		}
		for (Entry<String, Integer> d : hmap.entrySet()) {
			System.out.println(d.getKey() + "c" + d.getValue());
		}

//		try {
//			int a[] = { 1, 2, 3, 4, 5 };
//			for (int i = 0; i < 5; i++)
//				System.out.println(a[i]);
//
//			int x = 1 / 10;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("a");
//		} catch (ArithmeticException e) {
//			System.out.print("b");
//		}
	}

}
