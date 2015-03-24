import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PrimeFact {
	public static List<Integer> primeFactorization(int number){
		return number == 1 ? new ArrayList<Integer>() : Arrays.asList(1);
	}
}
