package com.java.stream_Api;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class StreamExample {
	final static Logger LOGGER = Logger.getLogger(StreamExample.class.getName());

	public static void main(String[] args) {
		List<String> wordList = Arrays.asList("Hello", "world", "how");
		wordList.stream().filter(word -> word.toLowerCase().startsWith("h")).forEach(System.out::println);

		LOGGER.info("------------------------------");

		wordList.stream().map(String::toUpperCase).forEach(System.out::println);

		LOGGER.info("------------------------------");

		String reduce = wordList.stream().reduce("", (a, b) -> a + " " + b);
		System.out.println(reduce);
	}

}
