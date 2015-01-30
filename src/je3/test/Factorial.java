package je3.test;

public class Factorial {

	private static final long[] table;
	private static int last = 0; 
	
	static {
		table = new long[21];
		table[0] = 1;
	}
	
	public static long compute(long x) {
		if (x > table.length) throw new IllegalArgumentException("X is too large");
		if (x < 0) throw new IllegalArgumentException("X is too small");
		while (x > last) {
			table[last + 1] = table[last] * (last + 1);
			last++;
		}
		return table[last];
	}
	public static void draw(java.awt.Graphics g) {
		g.drawRect(0, 0, 200, 100);
	}
	
	public static void main(String[] args) {
		System.out.println(Factorial.compute(21));
	}

}
