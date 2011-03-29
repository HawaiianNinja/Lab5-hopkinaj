import java.util.ArrayList;

public class PrimeFactorization {

	public static ArrayList<Integer> factors(int i) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (; i > 1; ) {
			if (i % 2 == 0) {
				list.add(2);
				i/=2;
			} else if (i % 3 == 0) {
				list.add(3);
				i/=3;
			}
		}

		return list;
	}

}
