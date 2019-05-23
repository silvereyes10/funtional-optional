package io.silvereyes10.sample.func.chap1.lambda;

/**
 * @author namseh.lee on 2019-05-23
 */

public class LambdaSample {
	public static void main(String[] args) {
		LambdaGreetingInterface greetingImpl1 = () -> {
			System.out.println("First Hello ~ ");
		};
		greetingImpl1.greet();

		LambdaGreetingInterface greetingImpl2 = () -> System.out.println("Second Hello ~ ");
		greetingImpl2.greet();

		LambdaNameGreetingInterface greetingImpl3 = (name) -> {
			System.out.println(name + " Hello ~");
		};
		greetingImpl3.greet("Everybody");

		LambdaNameGreetingInterface greetingImpl4 = name -> System.out.println(name + " Hello ~");
		greetingImpl4.greet("Everyone");
	}
}
