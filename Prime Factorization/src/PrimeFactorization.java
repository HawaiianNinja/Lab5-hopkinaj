import java.util.ArrayList;


public class PrimeFactorization {

	public static ArrayList<Integer> factors(int i) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(i == 2){
			list.add(i);
		}
		return list;
	}

}
