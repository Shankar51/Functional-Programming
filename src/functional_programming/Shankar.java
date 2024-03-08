package functional_programming;

public class Shankar {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7,8,9,10};
		
		Abc abc = ar ->{
			for(int i=0;i<ar.length;i++) {
				if(ar[i]%2==0) {
					System.out.println(ar[i]);
				}
			}
		};
		abc.printEven(arr);
		
	}

}

interface Abc{
	void printEven(int[] ar);
}