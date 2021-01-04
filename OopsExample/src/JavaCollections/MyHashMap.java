package JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(103, "Gaurav");
		System.out.println("Initial list of elements: " + map);

//		adding new data
		map.put(109, "anke");
		map.put(110, "moken");
		System.out.println("adding new elements" + map);

//		remove data
		map.remove(100);
		map.remove(103, "Gaurav");
		System.out.println("remove data" + map);

//		replace new data
		map.replace(102, "don");
		map.replace(101, "Vijay", "vimal");
		System.out.println("replace data" + map);

//		hashmap using for loop
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getValue() + " " + m.getKey());
		}
//		copy one map to another map
		HashMap<Integer, String> map1 = new HashMap<Integer, String>(map);
		map1.put(104, "kankeah");
		map1.put(105, "mukil");
		map1.put(null, null);
		System.out.println(map1);
		System.out.println("set" + map1.entrySet());
		System.out.println("values" + map1.values());
		System.out.println("keys" + map1.keySet());

	}
}

//  2. before each for loop add or remove
//  3. guide to insert null value(key and value)
//  4. how hashmap working internally
//  5. copy hashmap to another list 
//  6. remove an item during iteration