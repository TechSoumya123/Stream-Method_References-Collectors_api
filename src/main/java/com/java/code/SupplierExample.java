package com.java.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<List<Integer>> supplier = () -> Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(supplier.get());

		Supplier<List<Integer>> supplier1 = ArrayList::new;
		System.out.println(supplier1.get());

	}

}
