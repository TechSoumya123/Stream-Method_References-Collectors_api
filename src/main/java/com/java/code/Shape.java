package com.java.code;

@FunctionalInterface
interface IShape {
	void draw(String data);
}

public class Shape {

	public static void main(String[] args) {

		IShape shape = t -> System.out.println("okk....... " + t);
		shape.draw("123...........");
	}

}
