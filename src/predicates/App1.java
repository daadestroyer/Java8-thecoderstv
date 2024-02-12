package predicates;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class App1 {
	
	static void check(Predicate<String> p2,List<String> list) {
		
		for(String word:list) {
			
			if(p2.test(word)) {
				System.out.println(word);
			}
			
			
		}
	}
	public static void main(String[] args) {
		Predicate<String> p = (str) -> str.length() > 5;
			
		Predicate<Collection> p1 = (c) -> c.isEmpty();
		
		List<Integer> list = Arrays.asList(10,20,30);
		
//		System.out.println(p1.test(list));
		
		List<String> list1 = Arrays.asList("aram","laxman","ebharath","shatrughan");
		
		
		Predicate<String> p2 = (word)->{
			if(word.startsWith("a")) {
				return true;
			}
			else if(word.startsWith("e")) {
				return true;
			}
			else if(word.startsWith("i")) {
				return true;
			}
			else if(word.startsWith("o")) {
				return true;
			}
			else if(word.startsWith("u")) {
				return true;
			}
			else {
				return false;
			}
		};
	
		check(p2,list1);
		
		
	}
}
