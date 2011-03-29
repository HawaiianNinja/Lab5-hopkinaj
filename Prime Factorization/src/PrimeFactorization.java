import java.util.ArrayList;


public class PrimeFactorization {

	public static ArrayList<Integer> factors(int i) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(i > 1){
			list.add(i);
		}
		return list;
	}

}
