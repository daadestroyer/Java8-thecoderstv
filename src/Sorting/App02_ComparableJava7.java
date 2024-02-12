package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Comparable(I)
-------------
>>> Comparable is a Functional Interface which contains only one abstract method called compareTo() method
>>> public int compareTo(T o);
>>> Comparable provide default natural sorting
>>> Let's suppose we are comparing two numbers with this method
    10.compareTo(20) --> [give -1] means 10 need to come before 20
    20.compareTo(10) --> [give 1] means 20 need to come after 10
    10.compareTo(10) --> [give 0] means both the numbers are equal
>>> All Wrapper Classes [Byte,Short,Integer,Long,Float,Double,Boolean,Character], String, StringBuffer and
    StringBuilder by default implement comparable interface. Hence for this sort method simply will work
    to sort
    
*/
class Laptop implements Comparable<Laptop>{
	int lid;
	String laptopCompany;
	double laptopPrice;

	public Laptop(int lid, String laptopCompany, double laptopPrice) {
		super();
		this.lid = lid;
		this.laptopCompany = laptopCompany;
		this.laptopPrice = laptopPrice;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", laptopCompany=" + laptopCompany + ", laptopPrice=" + laptopPrice + "]";
	}

	@Override
	public int compareTo(Laptop laptop) {
		return this.lid>laptop.lid ? 1:-1;
	}

}

public class App02_ComparableJava7 {
	public static void main(String[] args) {
		List<Laptop> laptopList = Arrays.asList(new Laptop(101, "Acer", 40000), new Laptop(102, "Dell", 80000),
				new Laptop(103, "HP", 60000), new Laptop(104, "Apple", 130000));
		
		
		Collections.sort(laptopList);
		laptopList.forEach(System.out::println);
	}
}
