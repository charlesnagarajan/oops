package oops1;

public class Array1 {
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < 5; i++) {
			System.out.println(array[i]);
		}
//		System.out.println(array);

		char[] add = { 'a', 'b', 'c', 'd', 'e', 'f', 'c', 'r', 'g', 'e', 'm' };

		int i = 0;
		while (i < 11) {
			System.out.println(add[i]);
			i++;
		}

		for (char s : add) {
			System.out.println("array:" + s);
		}

		double[] al = { 1.0, 405.9, 89698.0578, 908.08, 8877.97 };
		for (int m = 0; m < 5; m++) {
			System.out.println(al[m]);
		}

		int a = 3;
		int b = 4;
		System.out.print(" " + 7 + 2 + " ");
		System.out.print(" " + a + b + " ");
		System.out.print(a + b);

//		char[] arr = new char[5];
//		arr[0] = 'c';

		System.out.println("ao" + (2 + 8));
	}

}
