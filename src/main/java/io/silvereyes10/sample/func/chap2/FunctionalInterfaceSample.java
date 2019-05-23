package io.silvereyes10.sample.func.chap2;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * @author namseh.lee on 2019-05-23
 */

public class FunctionalInterfaceSample {
	public static void main(String[] args) {
		// Runnable Sample -> Thread 수행
		Runnable runnable = () -> System.out.println("Runnable Sample");
		runnable.run();


		// Comparator<T> Sample -> 두 Parameter를 비교
		Comparator<Integer> comparator = (integer1, integer2) -> integer1.compareTo(integer2);
		System.out.println("Comparator Sample -> " + comparator.compare(10, 10));


		// Supplier<T> Sample -> Parameter 없음, Return 있음
		Supplier<String> supplier = () -> "Supplier Sample";
		System.out.println(supplier.get());


		// Consumer<T> Sample -> Parameter 있음, Return 없음
		Consumer<String> consumer = str -> System.out.println("Consumer Sample -> " + str);
		consumer.accept("Consumer String");


		// Function<T, R> Sample -> Parameter 있음, Return 있음
		Function<String, Integer> function = str -> Integer.parseInt(str);
		System.out.println("Function Sample -> " + function.apply("1"));


		// Predicate<T> Sample -> Parameter 있음, Return Boolean
		Predicate<String> predicate = str -> "sample".equals(str);
		System.out.println("Predicate Sample -> " + predicate.test("sample"));


		// UnaryOperation<T> Sample -> Parameter 있음, Return 있음. Parameter와 Return의 타입이 동일
		UnaryOperator<String> unaryOperation = str -> "Operation : " + str;
		System.out.println("UnaryOperation Sample -> " + unaryOperation.apply("unary sample"));


		// BinaryOperation<T> Sample -> 두개의 Parameter 있음, Return 있음. 두개의 Parameter와 Return의 타입이 동일
		BinaryOperator<String> binaryOperator = (str1, str2) -> "Operation : " + str1 + " : " + str2;
		System.out.println("BinaryOperator Sample -> " + binaryOperator.apply("sample1", "sample2"));


		// BiPredicate<T, U> Sample -> 두개의 Parameter 있음, Return Boolean
		BiPredicate<String, Integer> biPredicate = (string, integer) -> Integer.parseInt(string) == integer;
		System.out.println("BiPredicate Sample -> " + biPredicate.test("10", 10));


		// BiConsumer<T, U> Sample -> 두 개의 Parameter 있음, Return 없음
		BiConsumer<String, Integer> biConsumer = (string, integer) -> System.out.println("BiConsumer Sample -> " + string + " : " + integer);
		biConsumer.accept("Sample", 123);


		// BiFunction<T, U, R> Sample -> 두 개의 Parameter 있음, Return 있음
		BiFunction<String, Integer, String> biFunction = (string, integer) -> string + " : " + integer;
		System.out.println("BiFunction Sample -> " + biFunction.apply("Sample", 123));
	}
}
