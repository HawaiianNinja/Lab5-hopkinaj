import java.util.ArrayList;

public class PrimeFactorization {

	public static ArrayList<Integer> factors(int i) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (i % 2 == 0) {
			list.add(2);
			i /= 2;
		}
		if (i > 1) {
			list.add(i);
		}
		return list;
	}

}
