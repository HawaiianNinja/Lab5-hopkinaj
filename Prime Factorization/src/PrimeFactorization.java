import java.util.ArrayList;

/* 
 * Our solution for the prime factorization problem
 */

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

	public static ArrayList<Integer> primeNumbers(int i) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(i > 2){
			list.add(2);
		}
		return list;
	}

}
