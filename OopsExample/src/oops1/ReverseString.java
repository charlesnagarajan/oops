package oops1;

public class ReverseString {

	public static void main(String[] args) {

		String str = "charlssam";
		char[] strarray = str.toCharArray();
		for (int i = strarray.length - 1; i >= 0; i--) {
			System.out.print(strarray[i]);

		}
		System.out.println("doooon");
		StringBuffer sd = new StringBuffer(str);
		System.out.print(sd.reverse());

	}

}
