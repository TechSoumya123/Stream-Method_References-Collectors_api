package com.java.Method_References;

import java.util.function.BiFunction;
import java.util.logging.Logger;

interface NonStaticMethodExample {
	void getData(String msg);
}

interface NonStaticMethodExample1 {
	int addition(int num1, int num2);
}

public class InstanceMethod_References {

	final static Logger LOGGER = Logger.getLogger(InstanceMethod_References.class.getName());

	void fetchData(String value) {
		System.out.println("InstanceMethod_References " + value);
	}

	int add(int no1, int no2) {
		return no1 + no2;
	}

	public static void main(String[] args) {

		InstanceMethod_References iReferences = new InstanceMethod_References();
		NonStaticMethodExample nExample = iReferences::fetchData;
		nExample.getData("add....");

		LOGGER.info("---------------------------------");

		NonStaticMethodExample1 nExample1 = iReferences::add;
		System.out.println(nExample1.addition(100, 1));

		BiFunction<Integer, Integer, Integer> same_nExample1 = iReferences::add;
		System.out.println(same_nExample1.apply(100, 1));
	}

}
