package Examples;

public class PerformanceTest {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		StringBuffer d = new StringBuffer("java");
		for (int i = 0; i <= 1000; i++) {
			d.append("tpoint");
		}
		System.out.println("Stringbuffer taken time by:" + (System.currentTimeMillis() - startTime) + "ms");

		long startTime1 = System.currentTimeMillis();
		StringBuilder d1 = new StringBuilder("java");
		for (int i = 0; i <= 1000; i++) {
			d1.append("tpoint");
		}
		System.out.println("StringBUilder taken time by:" + (System.currentTimeMillis() - startTime1) + "ms");

	}

}
