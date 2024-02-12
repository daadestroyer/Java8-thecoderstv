package predicates;

import java.awt.Checkbox;
import java.util.function.Predicate;

public class App2 {

	static void check(Predicate<Integer> p, int[] arr) {
		for (int i : arr) {
			if (p.test(i)) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 15, 3, 5, 7, 10, 20, 50 };

		Predicate<Integer> p1 = (num1) -> num1 % 2 == 0;
		Predicate<Integer> p2 = (num2) -> num2 > 7;
		Predicate<Integer> p3 = (num3) -> num3 % 2 != 0;

		check(p1.and(p2), arr);

		System.out.println("-----");

		check(p1.or(p2), arr);

		System.out.println("-----");

		check(p2.negate(), arr);
	}

}
