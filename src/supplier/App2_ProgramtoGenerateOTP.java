package supplier;

import java.util.function.Supplier;

public class App2_ProgramtoGenerateOTP {
	public static void main(String[] args) {
		
		Supplier<String> s = () -> {
			String OTP = "";
			for(int i=1 ; i<=6 ; i++) {
				int random = (int)(Math.random()*6);
				OTP+=random;
			}
			return OTP;
		};
		
		System.out.println(s.get());
	}
}
