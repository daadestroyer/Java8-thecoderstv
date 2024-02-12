package doublecolonforeach;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class App01 {
	public static void main(String[] args) {
		// older approach
		/*
		List<String> list = List.of("ram","laxman","bharath","shatrughan");
		for(String str:list) {
			System.out.println(str);
		}
		*/
		
		// newer approach using forEach
		List<String> list = List.of("ram","laxman","bharath","shatrughan");
		
		// way - 1 using lambda expression
		 list.forEach((name)->System.out.println(name));
		
		// way - 2 using double colon operator
		list.forEach(System.out::println);
		
		
		Set<String> set = Set.of("AAA","BBB","CCC","DDD");
		// using older way
//		for(String str : set) {
//			System.out.println(str);
//		}
		
		// using lambda function with foreach
		// set.forEach((name)->System.out.println(name));
		
		// double colon operator with for each
		set.forEach(System.out::println);
		
		System.out.println();
		System.out.println();
		Map<String, String> map = Map.of("A","alex","B","Brian","T","Torreto");
		
		
//		for(Map.Entry<String, String> hm : map.entrySet()) {
//			System.out.println(hm.getKey()+":"+hm.getValue());
//		}
		
		map.forEach((k,v)->System.out.println(k+":"+v));
		
		// stream doesnt maintain order
		List<Integer> num = List.of(1,20,3,4,5,6,7);
		num.stream().filter((no)->no % 2==0).sorted().forEach(System.out::println);
		
		System.out.println();
		// parallel stream
		
		num.parallelStream().filter((no)->no%2==0).forEach(System.out::println);
		
	}
}
