package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App3 {
	public static void main(String[] args) {
		// count() -- gives the count of particular things

		List<String> namesList = Arrays.asList("ram", "laxman", "bharath", "shatrughan", "shiva", "vishnu", "narayan",
				"laxmi");

		// count all those names whose length are even
		long evenLengthNamesCount = namesList.stream().filter((name) -> name.length() % 2 == 0).count();
		System.out.println(evenLengthNamesCount);

		List<String> evenLengthNamesList = namesList.stream().filter((name) -> name.length() % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(evenLengthNamesList);
		
		
		long oddLengthNamesCount = namesList.stream().filter((name)->name.length() % 2 !=0).count();
		System.out.println(oddLengthNamesCount);
		
		
		List<String> oddLengthNamesList = namesList.stream().filter((name)-> name.length() % 2 !=0).collect(Collectors.toList());
		System.out.println(oddLengthNamesList);
	}
}
