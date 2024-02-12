package functions;

import java.util.function.Function;
import java.util.function.Predicate;

public class App1 {
	public static void main(String[] args) {
		Predicate<Integer> p1 = (num1) -> num1 > 10;
//		System.out.println(p1.test(30));

		// FUNCTIONS
		Function<String, String> f1 = (str) -> str.concat(" is a good channel");
		System.out.println(f1.apply("thecoderstv"));

	}
}
