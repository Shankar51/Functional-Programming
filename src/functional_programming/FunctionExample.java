package functional_programming;


public class FunctionExample {
	public static void main(String[] args) {
		try {
			String s = "10s";
			
			Functionn f = x -> {
				return Integer.parseInt(x);
			};
			System.out.println(f.apply(s));
		}catch(NumberFormatException e) {
			System.out.println("please use numbers only");
		}
		
	}
}

@FunctionalInterface
interface Functionn{
	Integer apply(String s);
}