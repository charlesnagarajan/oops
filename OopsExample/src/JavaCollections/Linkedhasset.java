package JavaCollections;

import java.util.LinkedHashSet;

public class Linkedhasset {

	public static void main(String[] args) {

		LinkedHashSet<Book> di = new LinkedHashSet<Book>();
		Book b1 = new Book(1, "charls", "22", "maths");
		Book b2 = new Book(2, "don", "22", "science");
		Book b3 = new Book(3, "karupu", "18", "tamil");
		Book b4 = new Book(4, "as", "34", "english");

		di.add(b1);
		di.add(b2);
		di.add(b3);
		di.add(b4);
		System.out.println(di);
		for (Book b : di) {
			System.out.println(b.id + "  " + b.studentname + "   " + b.age + "   " + b.sub);
		}

	}

}
