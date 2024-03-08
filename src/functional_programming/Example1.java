
//	using tradation way

package functional_programming;
import java.util.function.Consumer;

class ConsumerExample1 implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
	
}
public class Example1 {
	

	public static void main(String[] args) {
		
		 Consumer<Integer> ce1 = new ConsumerExample1();
		 ce1.accept(11);
	}

}
