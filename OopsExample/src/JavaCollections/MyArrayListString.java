package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyArrayListString {

	public static void main(String[] args) {

//	
		ArrayList<String> someList = new ArrayList<String>();

		someList.add("monkey");
		someList.add("donkey");
		someList.add("pig");
		someList.add("buffelow");
		someList.add("cow");
		System.out.println(someList);
		Collections.sort(someList);
		System.out.println("**************");

		for (Iterator<String> i = someList.iterator(); i.hasNext();) {
			String item = i.next();
			System.out.println(item);
		}
		System.out.println("**************");

		Iterator itr = someList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("**************");

		for (String obj : someList) {
			System.out.println(obj);
		}
		System.out.println("**************");

		for (int i = 0; i < someList.size(); i++) {
			System.out.println("don" + someList.get(i));
		}
	}

}

//		1. use different for loop(three more loop)
//		2. before each for loop add or remove
//		3. guide to insert null value (print only used)
//  	4. how arraylist working internally
//		5. copy arraylist to another list 
//		6. remove an item during iteration
//		7. sorting (int arraylist,Sting arraylist)
