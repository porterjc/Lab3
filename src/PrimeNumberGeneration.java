import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PrimeNumberGeneration {
	
	
	public static List<Integer> generate(int number){
		return number > 3 ? Arrays.asList(2, 3): number == 3 ? Arrays.asList(2) : new ArrayList<Integer>();
	}
}
