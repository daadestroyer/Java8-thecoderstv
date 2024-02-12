package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App01Java7 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,1,20,4,3,5,50,300,11);
		System.out.println(list); // unsorted
		Collections.sort(list);
		System.out.println(list); // sorted
		
		
		System.out.println();
		
		
		List<String> names = Arrays.asList("ram","laxman","bharath","shatrguhan");
		System.out.println(names);
		Collections.sort(names); // default natural sorting
		System.out.println(names);
		
		 
	}
}
