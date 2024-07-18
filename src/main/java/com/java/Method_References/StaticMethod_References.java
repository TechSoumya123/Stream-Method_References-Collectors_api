package com.java.Method_References;

@FunctionalInterface
interface Example {
	void get();
}

public class StaticMethod_References {

	static void data() {
		System.out.println("ok..........");
	}

	public static void main(String[] args) {
		Example okExample = StaticMethod_References::data;
		okExample.get();
	}
}
// The left-hand side of an assignment must be a variable
// The target type of this expression must be a functional interface
