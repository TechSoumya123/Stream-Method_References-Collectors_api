package com.java.code;

import java.util.ArrayList;
import java.util.List;

import lombok.var;

@FunctionalInterface
interface ISingleParameterAndWithOutReturnType {
	void sum(int num);
}

public class SingleParameterAndWithOutReturnType {
	public static void main(String[] args) {
		ISingleParameterAndWithOutReturnType singleParameterAndWithOutReturnType = num -> {
			List<Integer> listOfIntegers = new ArrayList<>();
			for (var i = 0; num > i; i++) {
				var mul = i * 2;
				if (mul % 2 == 0) {
					listOfIntegers.add(mul);
				}
			}
			System.out.println(listOfIntegers);
		};
		singleParameterAndWithOutReturnType.sum(20);

	}

}
