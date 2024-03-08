package functional_programming;

import java.util.List;
import java.util.stream.Collectors;

//Task 1: Filter Even Numbers
//Implement a method that takes a list of integers as input and uses a lambda function to filter out the even numbers. 
//Then, print the filtered list.

public class FilterEvenNum {

	public static void main(String[] args) {
		List<Integer> lst = List.of(1,2,3,4,5,6,7,8,9);
		
		List<Integer> cl = lst.stream().filter(a -> a%2==0).collect(Collectors.toList());
		System.out.println(cl);
		

	}

}
