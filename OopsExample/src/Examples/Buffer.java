package Examples;

public class Buffer {

	public static void main(String[] args) {

		String st = "MaDhan";
		StringBuffer m = new StringBuffer(st);
		System.out.println(m.reverse());

		StringBuffer str1 = new StringBuffer("amit");
		StringBuffer str2 = new StringBuffer("amit");
		String str3 = "amit";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));

	}

}
