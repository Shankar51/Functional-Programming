package functional_programming;

import java.util.List;

//Task 2: Find Maximum Number

//Write a method that finds the maximum number in an array of integers using a lambda function. 
//Print the maximum number found.

public class MaxFromArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
//		System.out.println(maxNum(arr));
		
		Ma ma = ar -> {
			int max=0;
			for(int i=0;i<ar.length;i++) {
				if(ar[i]>max) {
					max=ar[i];
				}
			}
			return max;
		};
		System.out.println(ma.maximumnum(arr));
	}
	
//	public static int maxNum(int []ar) {
//		int max=0;
//		for(int i=0;i<ar.length;i++) {
//			if(ar[i]>max) {
//				max=ar[i];
//			}
//		}
//		return max;
//	}
	
}

interface Ma{
	int maximumnum(int[] arr);
}
 
 
