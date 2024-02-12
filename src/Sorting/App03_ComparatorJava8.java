package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student {
	int studentId;
	String studentName;
	int pincode;

	public Student(int studentId, String studentName, int pincode) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.pincode = pincode;
	}

	
	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", pincode=" + pincode + "]";
	}

}

public class App03_ComparatorJava8 {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student(101, "Shubham Nigam", 208005),
				new Student(104, "Pankaj Nigam", 233212), new Student(106, "Rekha Nigam", 112344),
				new Student(109, "AP Nigam", 455443));

		// using anonymous inner classes
//		Collections.sort(studentList, new Comparator<Student>() {
//
//			public int compare(Student s1, Student s2) {
//				return s1.pincode > s2.pincode ? 1 : -1;
//			}
//		});
		
		// using java 8
		// 1-> first sorting is on the basis of id
		// 2-> second sorting is on the basis of pincode
//		List<Student> collect = studentList.stream().sorted(Comparator.comparing(Student::getStudentId)).collect(Collectors.toList());
		
//		List<Student> collect = studentList.stream().sorted((s1,s2)->s1.getPincode()- s2.getPincode()).toList();
		
//		Collections.sort(studentList,(s1,s2)->s1.getPincode()-s2.getPincode());
		
		Collections.sort(studentList,Comparator.comparing(Student::getStudentName));
		
		studentList.forEach(System.out::println);
		
	}

	 
}
