package oops1;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {

		int n = 0, n1 = 1, n2, count = 10, i;
		System.out.println(n + "  " + n1);

		for (i = 2; i < count; ++i) {
			n2 = n + n1;
			System.out.println("" + n2);
			n = n1;
			n1 = n2;

		}

		int num, a = 0, b = 0, c = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number of times");
		num = in.nextInt();
		System.out.println("fibonacci series is");
		for (int s = 0; s < num; s++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a + "");

		}

	}

}
