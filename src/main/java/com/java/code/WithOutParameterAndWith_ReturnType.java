package com.java.code;

@FunctionalInterface
interface IWithOutParameterAndWith_ReturnType {

	int noParameterAndReturnType();
}

public class WithOutParameterAndWith_ReturnType {

	public static void main(String[] args) {

		IWithOutParameterAndWith_ReturnType wAndWithOutReturnType = () -> 1 + 9;
		System.out.println(wAndWithOutReturnType.noParameterAndReturnType());
	}

}
