package doublecolonoperator;


@FunctionalInterface
interface inter{
	void m1(int a);
}
public class App01{
	
	// existing implementation
	public void m1(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
			// using lambda function
			inter i = (a)->System.out.println(a);
			i.m1(10);
			
			
			// static method reference
			// using double colon operator
			
			inter i1 = new App01()::m1; 
			i1.m1(20);
			
	}
}

