package supplier;

import java.util.function.Supplier;

public class App1_ProgramToGenerateRandomNumber {
	public static void main(String[] args) {
			
		Supplier<String> s = ()->{
			String[] s1 = {"ram","laxman","bharath","shatrughan","radha","krishna"};
			int random = (int)(Math.random() * 6);
			System.out.println(random);
			return s1[random];
		};
		
		System.out.println(s.get());
	}
}
