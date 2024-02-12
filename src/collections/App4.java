package collections;

import java.util.Arrays;
import java.util.List;

public class App4 {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,100,2333,232,12);
		
		Integer minInteger = asList.stream().min((num1,num2)->num1.compareTo(num2)).get();
		Integer maxInteger = asList.stream().max((num1,num2)->num1.compareTo(num2)).get();
		System.out.println(minInteger);
		System.out.println(maxInteger);
		
		
	}
}
