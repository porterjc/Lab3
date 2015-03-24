import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class PrimeFactTest {

	@Test
	public void testFor1() {
		List<Integer> primes = PrimeFact.primeFactorization(1);
		assertEquals(primes, new ArrayList<Integer>());
	}
	
	@Test
	public void testFor2() {
		List<Integer> primes = PrimeFact.primeFactorization(2);
		List<Integer> expected = new ArrayList();
		expected.add(1);
		assertEquals(primes, expected);
	}

}
