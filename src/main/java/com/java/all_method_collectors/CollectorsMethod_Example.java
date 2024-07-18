package com.java.all_method_collectors;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectorsMethod_Example {

	final static Logger logger = Logger.getLogger(CollectorsMethod_Example.class.getName());

	public static void main(String[] args) {

		IntStream.rangeClosed(1, 10).boxed().toList().stream().collect(Collectors.toMap(t -> t, t -> t * t)).entrySet()
				.stream().forEach(s -> System.out.println(s.getKey() + " " + s.getValue()));

		logger.info(() -> "----------------------------------------");

		List<String> list = Arrays.asList("soumya", "mondal", "sintu");
		list.stream().collect(Collectors.toConcurrentMap(e -> e.charAt(0), String::toUpperCase, (o, n) -> n)).entrySet()
				.forEach(System.out::println);

		logger.info(() -> "----------------------------------------");

		IntStream.rangeClosed(1, 10).boxed().toList().stream()
				.collect(Collectors.groupingBy(t -> t, Collectors.counting())).entrySet().forEach(System.out::println);

		logger.info(() -> "----------------------------------------");

		Integer collect = IntStream.rangeClosed(1, 10).boxed().toList().stream().collect(Collectors.summingInt(e -> e));
		System.out.println(collect);

		logger.info(() -> "----------------------------------------");

		Double collect2 = IntStream.rangeClosed(1, 10).boxed().toList().stream()
				.collect(Collectors.averagingInt(t -> t));
		System.out.println(collect2);

		logger.info(() -> "----------------------------------------");

		IntStream.rangeClosed(1, 100).boxed().toList().stream().collect(Collectors.partitioningBy(e -> e % 2 == 0))
				.entrySet().forEach(s -> System.out.println(s.getKey() + " " + s.getValue()));

		logger.info(() -> "----------------------------------------");

		List<Character> characters = Arrays.asList('s', 'o', 'u', 'm', 'y', 'a');
		String collect3 = characters.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println(collect3);

	}

}
