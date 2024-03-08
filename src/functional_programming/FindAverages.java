package functional_programming;

public class FindAverages {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7};
//		System.out.println(average(arr));
		Averages averages = ar ->{
			double sum=0.0;
			for(int i=0;i<ar.length;i++) {
				sum+=ar[i];
			}
			return sum/ar.length;
		};
		System.out.println(averages.averageOfArray(arr));

	}
	
//	public static double average(int[] arr) {
//		double sum=0.0;
////		double avg=0.0;
////		for(int i=0;i<arr.length;i++) {
////			sum+=arr[i];
////		}
////		
////		return sum/arr.length;
//	}

}
interface Averages{
	double averageOfArray(int[] ar);
}