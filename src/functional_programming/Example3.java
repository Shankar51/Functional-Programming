package functional_programming;

import java.util.function.Consumer;

public class Example3 {

	public static void main(String[] args) {
		Consumer<String> consumer = (String t)-> System.out.println(t);
		consumer.accept("shankar");
		

	}

}
