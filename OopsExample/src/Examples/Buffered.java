package Examples;

public class Buffered {
	public static void main(String args[]) {

		int n = 999999;
		long t;

		{
			StringBuffer sb = new StringBuffer();
			t = System.currentTimeMillis();
			for (int i = n; i-- > 0;) {
				sb.append("ABCD-");
			}
			System.out.println(System.currentTimeMillis() - t);
		}
		{
			StringBuilder sd = new StringBuilder();
			t = System.currentTimeMillis();
			for (int i = n; i-- > 0;) {
				sd.append("12345-");
			}
			System.out.println(System.currentTimeMillis() - t);
		}

		StringBuffer d = new StringBuffer("hello");
		StringBuffer d1 = new StringBuffer("hello");
		d.append(d1);

		System.out.println(d);
		System.out.println(d.equals(d1));

	}

}
// which is the fast ? string builder faster than string buffer
// which is thread safe? String buffer thread safe string builder not thread safe
