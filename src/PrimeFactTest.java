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
		expected.add(2);
		assertEquals(primes, expected);
	}
	
	@Test
	public void testFor3() {
		List<Integer> primes = PrimeFact.primeFactorization(3);
		List<Integer> expected = new ArrayList();
		expected.add(3);
		assertEquals(primes, expected);
	}
	
	@Test
	public void testFor4() {
		List<Integer> primes = PrimeFact.primeFactorization(4);
		List<Integer> expected = new ArrayList();
		expected.add(2);
		expected.add(2);
		assertEquals(primes, expected);
	}

	@Test
	public void testFor6() {
		List<Integer> primes = PrimeFact.primeFactorization(6);
		List<Integer> expected = new ArrayList();
		expected.add(2);
		expected.add(3);
		assertEquals(primes, expected);
	}
	
	@Test
	public void testFor8() {
		List<Integer> primes = PrimeFact.primeFactorization(8);
		List<Integer> expected = new ArrayList();
		expected.add(2);
		expected.add(2);
		expected.add(2);
		assertEquals(primes, expected);
	}
}
