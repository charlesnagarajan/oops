package JavaCollections;

public class InitTest {
	public InitTest() {
		s1=sM1("1");
	}
	static String s1=sM1("a");
	String s3=sM1("2");
	{
		s1=sM1("3");
	}
	static {
		
	}
	private static String sM1(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
