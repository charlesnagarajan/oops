package onlineprograms;

public class BootTest1 {

	public static void main(String[] args) {

		String str = "hello";
		String str1 = "hello";

		System.out.println(str == str1);
		System.out.println(str.equals(str1));
		System.out.println(str == str1);

		int age = 18;
		if (age <= 17) {
			System.out.println("eligible");

		} else {
			System.out.println("not eligible");
		}
	}

}
