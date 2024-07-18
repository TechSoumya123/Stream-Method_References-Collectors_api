package com.java.code;

public class RunnableExample {

	public static void main(String[] args) {

		Runnable runnable = () -> System.out.println("Runnable is used to create thread.....");
		Thread thread = new Thread(runnable);
		thread.start();

	}

}
