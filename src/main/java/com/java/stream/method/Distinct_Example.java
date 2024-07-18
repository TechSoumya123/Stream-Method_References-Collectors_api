package com.java.stream.method;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Distinct_Example {
	final static Logger logger = Logger.getLogger(Distinct_Example.class.getName());

	public static void main(String[] args) {

		List<String> listOf_Strings = List.of("one", "two", "three", "one", "three", "four", "two");

		List<String> listOf_Strings2 = List.of();

		listOf_Strings.stream().distinct().forEach(System.out::println);
		logger.info(() -> "----------------------------------------");

		Set<String> collect = listOf_Strings.stream().collect(Collectors.toSet());
		System.out.println(collect);

		logger.info(() -> "----------------------------------------");

		List<String> collect2 = listOf_Strings.stream().sorted().collect(Collectors.toList());
		System.out.println(collect2);

		logger.info(() -> "----------------------------------------");

		List<List<Integer>> of = List.of(IntStream.rangeClosed(1, 500).boxed().toList());
		of.stream().flatMap(list -> list.stream()).toList().stream().limit(400).forEach(System.out::println);

		logger.info(() -> "----------------------------------------");

		of.stream().flatMap(list -> list.stream()).toList().stream().skip(200).forEach(System.out::println);

		logger.info(() -> "----------------------------------------");

		Optional<String> reduce = listOf_Strings.stream().reduce((a, b) -> a + " " + b);
		System.out.println(reduce.get());

		logger.info(() -> "----------------------------------------");

		String reduce2 = listOf_Strings2.stream().reduce("", (a, b) -> a + " " + b);
		System.out.println(reduce2);

		logger.info(() -> "----------------------------------------");

		List<Integer> all_Match = List.of(10, 20, 30, 50, 52);
		boolean allMatch = all_Match.stream().allMatch(t -> t % 2 == 0);
		System.out.println("allMatch result: " + allMatch);

		logger.info(() -> "----------------------------------------");
		List<Integer> any_match = List.of(10, 20, 31, 50, 52);
		boolean anyMatch = any_match.stream().anyMatch(t -> t % 2 != 0);
		System.out.println("anyMatch result: " + anyMatch);

		logger.info(() -> "----------------------------------------");

		List<Integer> none_match = List.of(10, 20, 31, 50, 52);
		boolean noneMatch = none_match.stream().anyMatch(t -> t % 2 != 2);
		System.out.println("noneMatch result: " + noneMatch);

		logger.info(() -> "----------------------------------------");

		List<Integer> List_findFirst = List.of(10, 20, 31, 50, 52);
		Optional<Integer> findFirst = List_findFirst.stream().findFirst();
		System.out.println("FindFirst result: " + findFirst.get());

		logger.info(() -> "----------------------------------------");

		List<Integer> List_findAny = List.of(10, 20, 31, 50, 52);
		Optional<Integer> findAny = List_findAny.stream().findAny();
		System.out.println("FindAny result: " + findAny.get());

		logger.info(() -> "----------------------------------------");

		List<Integer> list_max = List.of(10, 20, 31, 50, 52);
		Optional<Integer> max = list_max.stream().max(Integer::compare);
		System.out.println("Max result: " + max.get());

		logger.info(() -> "----------------------------------------");

		List<Integer> list_min = List.of(10, 20, 31, 50, 52);
		Optional<Integer> min = list_min.stream().min(Integer::compare);
		System.out.println("Min result: " + min.get());
		
		logger.info(() -> "----------------------------------------");

		List<Integer> list_Count = List.of(10, 20, 31, 50, 52);
		long count = list_Count.stream().count();
		System.out.println("count result: " + count);

	}

}
