package multipleinheritance;

interface Demo {
	default void m1() {

	}

	void m2();
}

abstract class Demo1 {
	void m1() {

	}

	abstract void m2();
}

public class Main2 {

}
