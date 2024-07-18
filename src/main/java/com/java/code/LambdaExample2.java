package com.java.code;

@FunctionalInterface
interface MessagePassAsArgument {
	void messageAsArgument(String msg);
}

public class LambdaExample2 {

	public static void main(String[] args) {

		MessagePassAsArgument message = msg -> System.out.println(msg);
		message.messageAsArgument("Soumya do it quickly");
	}

}
