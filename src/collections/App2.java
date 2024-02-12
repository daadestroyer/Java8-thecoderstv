package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App2 {
	public static void main(String[] args) {
		// map -- to make some changes on collection while processing on it

		List<Integer> employeeSalList = Arrays.asList(20000, 25000, 35000, 45000, 10000, 5000, 100000);

		//List<Integer> updatedSalList = employeeSalList.stream().map((salary) -> salary > 30000 ? salary + 500 : salary).collect(Collectors.toList());
		List<Integer> updatedSalList = employeeSalList.stream().map((salary)->{
			if(salary > 30000) {
				salary +=500;
			}
			return salary;
		}).collect(Collectors.toList());
		
		System.out.println(updatedSalList);
		System.out.println();
		System.out.println();
		
		List<String> names = Arrays.asList("ram","bharath","laxman","shatrughan");
		
		List<String> updatedNames1 = names.stream().map((name)->name.toUpperCase()).collect(Collectors.toList());
		List<String> updatedNames2 = names.stream().map((name)->name.length() > 3 ? name.toUpperCase() : name).collect(Collectors.toList());
		System.out.println(updatedNames1);
		System.out.println(updatedNames2);
	}
}
