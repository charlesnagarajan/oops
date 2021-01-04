package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyArrayListInteger {

	public static void main(String[] args) {

		ArrayList<Integer> cars = new ArrayList<Integer>();
		cars.add(1);
		cars.add(2);
		cars.add(3);
		cars.add(40);
//		cars.add(null);
		cars.add(5);
		cars.add(6);
		cars.add(7);
		cars.add(4);
		cars.add(3);
		cars.add(20);

		System.out.println(cars);
		cars.remove(5);
		Collections.sort(cars);

		Iterator itr = cars.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println("%%%%%%%%%%%%%");
		for (int i : cars) {
			System.out.println(i);
		}
		System.out.println("*************");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}

	}
}
