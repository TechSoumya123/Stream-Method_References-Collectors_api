package com.java.code;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {

		Consumer<String> consumer = data -> System.out.println(data);
		consumer.accept("ok.............");

	}

}
