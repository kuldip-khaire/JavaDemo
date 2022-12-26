package com.velocity.demo;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalInterface {

	public static void main(String[] args) {
		
		
		Function<Integer, Integer> squareMe = (i) -> i*i;
		System.out.println(squareMe.apply(5));
		
		BiFunction<Integer, Integer, Integer> multiplyMe = (i,j) -> (i*j);
		System.out.println(multiplyMe.apply(10, 20));
		
		BiConsumer<Integer, Integer> divideMe = (i,j) -> System.out.println(i/j);
		divideMe.accept(20, 5);
		
		BiFunction<Integer, Integer, Integer> divideMe2 = (i,j) -> (i/j);
		System.out.println(divideMe2.apply(40, 20));
	}

}
