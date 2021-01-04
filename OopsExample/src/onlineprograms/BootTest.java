package onlineprograms;

public class BootTest {

	public static void main(String[] args) {
		Boolean b = new Boolean("false");
		boolean b2;
		b2 = b.booleanValue();
		if (!b2) {
			b2 = true;
			System.out.print("x");
		}
		if (b & b2)

		{
			System.out.print("y");
		}
		System.out.print("z");
	}

}
