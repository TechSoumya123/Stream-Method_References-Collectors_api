package com.java.stream_Api;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class StramExample {

	final static Logger logger = Logger.getLogger(StramExample.class.getName());

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Integer orElse = listOfIntegers.stream().filter(num -> num % 2 != 1).reduce(Integer::sum).orElse(2 * 4);
		System.out.println(orElse);
		logger.info("---------------------------------------");

		int sum = listOfIntegers.stream().filter(num -> num % 2 != 0).mapToInt(num -> num).sum();
		System.out.println(sum);
	}
}
