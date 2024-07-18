package com.java.map_flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Map_FlatMap_Example {

	final static Logger logger = Logger.getLogger(Map_FlatMap_Example.class.getName());

	public static void main(String[] args) {

		List<String> listOfStrings = Arrays.asList("apple", "mango", "banana", "fruits");
		listOfStrings.stream().map(fruit -> fruit.toUpperCase() + " = " + fruit.length()).forEach(System.out::println);

		logger.info(() -> "--------------------------------------");

		List<List<Integer>> list_OfLists = new ArrayList<>();
		list_OfLists.add(Arrays.asList(1, 2, 4));
		list_OfLists.add(Arrays.asList(20, 9, 40));
		list_OfLists.add(Arrays.asList(78, 90, 35));
		list_OfLists.add(Arrays.asList(11, 23, 76, 4, 56));
		System.out.println(list_OfLists);
		logger.info(() -> "--------------------------------------");
		List<Integer> list2 = list_OfLists.stream().flatMap(list -> list.stream()).toList();
		List<Integer> sorted = list2.stream().sorted().toList();
		System.out.println(sorted);

	}

}
