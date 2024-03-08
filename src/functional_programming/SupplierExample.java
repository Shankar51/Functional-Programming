package functional_programming;

public class SupplierExample {
	public static void main(String[] args) {
		Supplierr s = ()->{
			return 10;
		};
		System.out.println(s.get());
	}
}

interface Supplierr{
	Integer get();
}
