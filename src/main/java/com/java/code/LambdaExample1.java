package com.java.code;

@FunctionalInterface
interface Message {
	void message();
}

public class LambdaExample1 {
	public static void main(String[] args) {

		Message message1 = () -> System.out.println("ok.....");
		message1.message();
	}

}
