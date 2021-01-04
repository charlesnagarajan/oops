package oops1;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {

		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
//		String s1 = "charlsnagarajan";
		String[] words = s.trim().split("");
		System.out.println("enter the string:" + words.length);

//		System.out.println("enter how many bottles");
//		Scanner sc = new Scanner(System.in);
//		int m = sc.nextInt();
//		int b = 30;
//		int c = m * b;
//
//		System.out.println("" + c);
//
//		double shirt = 599.0;
//		System.out.println("enter how many shirt");
//		double s = sc.nextDouble();
//		double c1 = s * shirt;
//		System.out.println(c1);

	}

}
