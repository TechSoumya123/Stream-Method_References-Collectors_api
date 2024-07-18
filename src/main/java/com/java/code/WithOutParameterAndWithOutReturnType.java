package com.java.code;

@FunctionalInterface
interface IWithOutParameterAndWithOutReturnType {

	void noParameterAndNoReturnType();
}

public class WithOutParameterAndWithOutReturnType {

	public static void main(String[] args) {

		IWithOutParameterAndWithOutReturnType wAndWithOutReturnType = () -> System.out.println("Hey hello.......");
		wAndWithOutReturnType.noParameterAndNoReturnType();
	}

}
