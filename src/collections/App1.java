package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.accessibility.AccessibleAttributeSequence;
import javax.swing.GroupLayout.Alignment;

public class App1 {
	public static void main(String[] args) {
		
		// filter()
		// collect()
		// Collectors.toList()
		
		// collections(objects)
		List<Integer> asList = Arrays.asList(10,4,3,1,5,50,6,70);
		
		
		// before java 8
		for(int i=0; i<asList.size();i++) {
			System.out.println(asList.get(i));
		}
		System.out.println();
		for(int i=0; i<asList.size();i++) {
				if(asList.get(i) % 2 ==0) {
					System.out.println(asList.get(i)+"even");
				}
				else {
					System.out.println(i+"odd");
				}
		}
		System.out.println();
		System.out.println("WITH JAVA 8");
		System.out.println();
		// with java 8
		
		// separate odd number (filter)
		
		List<Integer> oddlist = asList.stream().filter((num)->num %2 !=0).collect(Collectors.toList());
		List<Integer> evenlist = asList.stream().filter((num) -> num % 2 == 0).collect(Collectors.toList());
		System.out.println(oddlist);
		System.out.println(evenlist);
		
		
				
				
		
	}
}
