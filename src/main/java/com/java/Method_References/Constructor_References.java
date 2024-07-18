package com.java.Method_References;

import java.util.function.Function;

class Student {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

interface StudentInterface {
	
	Student getStudent(String name);
}

public class Constructor_References {

	public static void main(String[] args) {

		StudentInterface studentInterface = name -> new Student(name);
		System.out.println(studentInterface.getStudent("Soumya.......").getName());

		System.out.println("----------------------------");

		Function<String, Student> function = Student::new;
		Student apply = function.apply("Soumya");
		System.out.println(apply.getName());
	}

}
