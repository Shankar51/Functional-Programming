package functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		Predicate example
		List<Integer> list = integers.stream().filter(i->{
			return i%2==0;
		}).toList();
		System.out.println(list);

//		Function Example
		List<Integer> list2 = list.stream().map(x->{
			return x+10;
		}).toList();
		System.out.println(list2);
		
//		Consumer Example
		list2.forEach(x->System.out.println(x));
		
//		Supplier Example
		List<Integer> list3 = list.stream().map(x->{
			return x+10;
		}).collect(Collectors.toList());
		System.out.println(list3);
	}
}
