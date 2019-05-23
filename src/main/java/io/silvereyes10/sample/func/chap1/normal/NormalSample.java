package io.silvereyes10.sample.func.chap1.normal;

/**
 * @author namseh.lee on 2019-05-23
 */

public class NormalSample {
	public static void main(String[] args) {
		GreetingInterface greetingInterface1 = new GreetingInterfaceImpl();
		greetingInterface1.greet();

		GreetingInterface greetingInterface2 = new GreetingInterface() {
			@Override
			public void greet() {
				System.out.println("Hellow ~");
			}
		};
		greetingInterface2.greet();
	}
}
