package functional_programming;

import java.util.Arrays;
import java.util.List;

public class PrdeicateExample {
	public static void main(String[] args) {
		List<Integer> i = Arrays.asList(1,2,3,4,5,6,7);
		Predicatee p = k -> {
			return k%2==0;
		};
		
		for(Integer l: i) {
			if(p.flag(l)==true) {
				System.out.println(l);
			}
		}
	}
}

interface Predicatee{
	boolean flag(Integer i);
}
