package functional_programming;

public class Sample {
	public static void main(String[] args) {
//		Sun s = ()->System.out.println(5+2);
//		s.sum();
		sumab(()->System.out.println(5+2));
		
	}
	
	public static void sumab(Sun s) {
		s.sum();
	}
}
