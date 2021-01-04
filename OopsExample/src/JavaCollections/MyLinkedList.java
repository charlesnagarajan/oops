package JavaCollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {

		LinkedList<String> lmap = new LinkedList<String>();
		lmap.add("A");
		lmap.add("f");
		lmap.add("c");
		lmap.add("b");
		lmap.add("e");
		lmap.add("d");
//		lmap.add(new Integer(2));
//		lmap.add(new Integer(8));
//		lmap.add(new Integer(5));
//		lmap.add(new Integer(1));

		Iterator i = lmap.iterator();
		Collections.reverse(lmap);
		i.next();
		i.remove();
		while (i.hasNext())
			System.out.println(i.next() + "");

		Collections.sort(lmap);
		System.out.println("lmap" + lmap);

//		find size of linked list
		int size = lmap.size();
		System.out.println("Size of linked list = " + size);

//		change list new one
		lmap.set(2, "m");
		System.out.println(lmap);

//		remove list
		lmap.remove("m");
		System.out.println(lmap);

//		while adding anywhere elements
		lmap.add(2, "c");

//		add first element
		lmap.addFirst("AA");

//		add last element
		lmap.addLast("g");

//		iterator 
		Iterator<String> itr = lmap.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

//		for loop
		for (int o = 0; o < lmap.size(); o++) {
			System.out.println(lmap.get(o));
		}
		for (String obj : lmap) {
			System.out.println(obj);

		}
	}
}
