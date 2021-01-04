package oops1;

public class Array2 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

		for (int i = 2; i < 15; i = i + 3) {

			System.out.println(arr[i] * 3);

		}
		String[] st = { "charls", "kaar", "amul" };

		for (String don : st) {
			System.out.println(don);

		}
		String d = "welcome";

		StringBuffer d1 = new StringBuffer(d);
		System.out.println(d1.reverse());

		String str = "xyz";
		str.toUpperCase();
		String y = str.replace("Y", "y");
		y = y + "abc";
		System.out.println(y);
	}

}
