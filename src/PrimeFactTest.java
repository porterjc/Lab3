import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class PrimeFactTest {

	@Test
	public void test() {
		List<Integer> primes = PrimeFact.primeFactorization(1);
		assertEquals(primes, new ArrayList<Integer>());
	}

}
