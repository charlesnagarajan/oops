package oops1;

public class Array3 {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3 };
		int arr1[] = { 1, 2, 3 };
		if (arr == arr1) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		System.out.println(arr.equals(arr1));
		System.out.println(arr == arr1);

		int result = 0;
		Long x = new Long("42");
		Long y = new Long(42);
		Short s = new Short("42");
		System.out.println(x.equals(y));
		System.out.println(x == y);
		System.out.println(x.equals(s));

		if (x == y)
			result = 1;
		if (x.equals(y))
			result = result + 10;
		if (x.equals(s))
			result = result + 100;
		System.out.println(result);

	}

}
// write a program calculate sum of 3 digit
//



