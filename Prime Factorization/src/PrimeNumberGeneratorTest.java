import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeNumberGeneratorTest {
	@Test
	public void TestJunit() {
		assertTrue("this should pass", true);
	}
	
	@Test
	public void TestOne(){
		assertEquals(new ArrayList<Integer>(), PrimeFactorization.primeNumbers(1));
	}
}
