package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyArrayList2 {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("vijay");
		ar.add("rio");
		ar.add("prem");
		ar.add("arjun");
		ar.add("anu");
		ar.add("appu");
		ar.add("balu");
		ar.add("charls");
		ar.add("makgesh");

// Sorting elements
		Collections.sort(ar);
		System.out.println(ar);

//	remove elements during iteration
		Iterator<String> itr = ar.iterator();
		while (itr.hasNext()) {
			String arr = itr.next();
			if (arr.equals("makgesh")) {
				itr.remove();
			}
		}
		System.out.println("during iteration" + ar);

// remove elements
		ar.remove(3);
		ar.remove("vijay");
		System.out.println(ar);

// adding elements
		ar.add("kutty");
		ar.add("namo");
		System.out.println(ar);

// clearing all elements
//		ar.clear();

// Creating another arraylist  
		ArrayList<String> ad = new ArrayList<String>();
		ad.add("mano");
		ad.add("ragu");

//	copy ArrayList to another list
		ar.addAll(ad);
		System.out.println("adding elements" + ar);

// removing elements new arraylist
		ar.removeAll(ad);
		System.out.println(ar);

// removing base array elements
		ar.removeIf(str -> str.contains("charls"));
		System.out.println("removing elements" + ar);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}
}
