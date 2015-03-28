import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class PrimeNumberGenerationTest {
	   private Integer input;
	   private List<Integer> expected;
	   private PrimeNumberGeneration generator;

	   @Before
	   public void initialize() {
	      generator = new PrimeNumberGeneration();
	   }
	   
	   public PrimeNumberGenerationTest(Integer in, List<Integer> lst){
		   this.input = in;
		   this.expected = lst;
	   }
	   
	   @Parameterized.Parameters
	   public static Collection primes() {
		return Arrays.asList(new Object[][] {
			{1, new ArrayList<Integer>()},
			{2, new ArrayList<Integer>()}
		});   
	   }
	   
	   @Test
	   public void testPrimeNumberChecker() {
	      System.out.println("Input was: " + input);
	      assertEquals(expected, 
	      generator.generate(input));
	   }
}
