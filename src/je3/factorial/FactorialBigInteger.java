package je3.factorial;

import java.math.BigInteger;
import java.util.ArrayList;

public class FactorialBigInteger {
	
	private static final ArrayList<BigInteger> table;
	private static int last;
	
	static {
		table = new ArrayList<BigInteger>();
		table.add(BigInteger.valueOf(1));
	}
	
	public static synchronized BigInteger compute(int x) {

		for (int size = table.size(); size <= x; size++) {
			BigInteger lastFactor = table.get(size-1);
			BigInteger nextFactor = lastFactor.multiply(BigInteger.valueOf(size));
			table.add(nextFactor);
		}
		return table.get(table.size()-1);
	}
	
	public static void main(String[] args) {
		for (int i = 0; i <= 50; i++) {
			System.out.println(i + "! = " + compute(i));
		}	
		System.out.println(Math.ceil(4.00000000001));
	}
}
