package functional_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		list.forEach(new ConsumerImpl());
//		list.forEach((t)->System.out.println(t+t));
	}
}

class ConsumerImpl implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
}

