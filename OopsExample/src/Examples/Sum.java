package Examples;

public class Sum {

	public static void main(String[] args) {

		System.out.println(20 + 1.3f + "a" + "b");
		System.out.println("a" + "b" + 20 + 1.3f);

		System.out.println(45.4f + 10.6 + "b" + "rr" + "c");
		System.out.println("b" + "rr" + "c" + 45.4f + 10.6);
		

		String st = new String("hello");
		String st1 = new String("hello");
		System.out.println(st == st1);
		System.out.println(st.equals(st1));
		System.out.println(st + "" + st1);

	}

}
