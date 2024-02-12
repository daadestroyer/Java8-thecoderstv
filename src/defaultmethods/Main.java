package defaultmethods;

interface Inter {

	void m1();

	void m2();
	
	default void m3() {
		System.out.println("default m3");
	}
	
	 
	 

}

class Child1 implements Inter {
	
	public void m1() {
		System.out.println("Interface m1 default method overrided");
	}

	public void m2() {
		System.out.println("Interface m2 default method overrided");
	}
	
	 
	
}

class Child2 implements Inter {
	public void m1() {
		System.out.println("Interface m1 default method overrided");
	}

	public void m2() {
		System.out.println("Interface m2 default method overrided");
	}
}

public class Main {
	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.m1();
		child1.m3();
	}
}
