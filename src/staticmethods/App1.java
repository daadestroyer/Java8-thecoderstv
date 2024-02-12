package staticmethods;

// Java 8
interface Inter {
	default void m1() {
		System.out.println("default m1 method of interface");
	}

	static void m2() {
		System.out.println("static m1 methods of interface");
	}
}

public class App1 implements Inter{
	
	static void m2() {
		System.out.println("static m1 methods of app1");
	}
	public static void main(String[] args) {
			App1 app1 = new App1();
			app1.m1(); // it will work
			 app1.m2(); // CE: static method won't avaialbe to child class
			
			// Inter.m1(); // CE: interface default method can be access through child classes
			Inter.m2(); // it will work 
	}
}
