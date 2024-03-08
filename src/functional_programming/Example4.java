package functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Example4 {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);		
		Consumer<Integer> consumer=(t) -> System.out.println(t);
		integers.forEach(consumer);
//				OR
		
//		integers.forEach((t) ->   System.out.println(t));
		
		
				
	}

}
