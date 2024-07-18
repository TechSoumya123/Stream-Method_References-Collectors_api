package com.java.code;

@FunctionalInterface
interface IMultipleParameterAndWith_ReturnType {
	int sum(int num, int secondNum);
}

public class MultipleParameterAndWith_ReturnType {

	public static void main(String[] args) {

		IMultipleParameterAndWith_ReturnType multipleParameterAndWith_ReturnType = (num, secondNum) -> num + secondNum;
		System.out.println("Sum of two numbers = " + multipleParameterAndWith_ReturnType.sum(20, 30));
	}
}
