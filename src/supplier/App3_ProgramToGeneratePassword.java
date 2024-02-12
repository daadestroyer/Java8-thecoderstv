package supplier;

import java.util.function.Supplier;

public class App3_ProgramToGeneratePassword {
	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String pswd = "";
			Character[] characters = { 'A', 'B', 'C', 'D', 'E', '1', '2', '3', '4', '#', '@', '$', '*' };

			for (int i = 1; i <= 8; i++) {
				int random = (int) (Math.random() * 13);
				pswd+=characters[random];
			}
			return pswd;
		};
		
		System.out.println(s.get());
	}

}
