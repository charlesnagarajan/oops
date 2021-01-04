package JavaCollections;

public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion r = new Recursion();
		System.out.println(r.funn(5));

		int var = 20, i = 0;
		do {
			while (true) {
				if (i++ > var)
					break;
			}
		} while (i < var--);
		System.out.println(var);
		
	}
	
}
