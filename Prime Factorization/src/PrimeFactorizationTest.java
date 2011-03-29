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
	
	@Test
	public void TestFour(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(2);
		assertEquals(list, PrimeFactorization.factors(4));
	}
	
	@Test
	public void TestSix(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		assertEquals(list, PrimeFactorization.factors(6));
	}
	
	@Test
	public void TestEight(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(2);
		list.add(2);
		assertEquals(list, PrimeFactorization.factors(8));
	}
	
	@Test
	public void TestNine(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(3);
		assertEquals(list, PrimeFactorization.factors(9));
	}
	
	@Test
	public void TestHugeNumber(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(7);
		list.add(7);
		list.add(1327);
		assertEquals(list, PrimeFactorization.factors(325115));
	}
}
