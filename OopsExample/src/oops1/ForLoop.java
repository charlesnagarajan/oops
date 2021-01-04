package oops1;

public class ForLoop {
	public static void main(String[] args) {

		long StartTime = System.currentTimeMillis();

		for (int i = 0; i <= 120; i = i + 5) {
			System.out.println(i);
		}
		System.out.println("forloop taken time:" + (System.currentTimeMillis() - StartTime) + "ms");

		int i = 0;
		while (i <= 120) {
			System.out.println(i);
			i = i + 5;

		}
		System.out.println("while loop taken time:" + (System.currentTimeMillis() - StartTime) + "ms");

		int m = 0;
		do {
			System.out.println(m);
			m = m + 5;
		} while (m <= 120);
		System.out.println("do while loop taken time:" + (System.currentTimeMillis() - StartTime) + "ms");

	}


}
