package com.java.code;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		Function<String, String> convertToUppercase = data -> data.toUpperCase();
		System.out.println(convertToUppercase.apply("Soumya Mondal...."));

	}

}
