package multipleinheritance;

interface Parent1{
	default void m1() {
		System.out.println("m1 of Left");
	}
}
interface Parent2{
	default void m1() {
		System.out.println("m1 of Right");
	}
}
class Child implements Parent1,Parent2{

	@Override
	public void m1() {
		Parent2.super.m1();
	}
	
}
public class Main {
	public static void main(String[] args) {
		Child child = new Child();
		child.m1();
	}

}
