import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PrimeNumberGeneration {
	
	
	public static List<Integer> generate(int number){
		ArrayList<Integer> factors = new ArrayList<Integer>();
		int num = number;
		for (int i = 2; i < number; i++) {
			
				if(!factors.contains(i) && isPrime(i)){
	    	  		factors.add(i);
				
				num /= i;
			}
		}
		//return number > 3 ? Arrays.asList(2, 3): number == 3 ? Arrays.asList(2) : new ArrayList<Integer>();
		return factors;
	}
	
	private static boolean isPrime(int number) {
		for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;
        return true;
}
}
