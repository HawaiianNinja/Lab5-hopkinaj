import java.util.ArrayList;

public class PrimeFactorization {

	public static ArrayList<Integer> factors(int i) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int x = 2;
		for (; x <= i; x++) {
			for (; i % x == 0; ) {
				if (i % x == 0) {
					list.add(x);
					i/=x;
				}
			}
		}

		return list;
	}

}
