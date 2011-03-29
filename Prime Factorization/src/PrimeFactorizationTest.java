import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeFactorizationTest {
	@Test
	public void TestJunit() {
		assertTrue("this should pass", true);
	}
	
	@Test
	public void TestOne(){
		assertEquals(new ArrayList<Integer>(), PrimeFactorization.factors(1));
	}
	
	@Test
	public void TestTwo(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		assertEquals(list, PrimeFactorization.factors(2));
	}
	
	@Test
	public void TestThree(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		assertEquals(list, PrimeFactorization.factors(3));
	}
}
