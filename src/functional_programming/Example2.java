package functional_programming;
//	using anonomaus function
import java.util.function.Consumer;

public class Example2 {

	public static void main(String[] args) {
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
		};
		consumer.accept("shankar");
	}

}
