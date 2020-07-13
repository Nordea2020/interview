/**
 * 
 */
package com.project.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author USER
 *
 */
public class FizzBuzzDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		IntStream.rangeClosed(1, 100).mapToObj(
				num -> num % 3 == 0 ? (num % 5 == 0 ? "FizzBuzz" : "Fizz") : (num % 5 == 0 ? "Buzz" : num + " "))
				.forEach(System.out::println);

		Stream<Integer> infiniteStream = Stream.iterate(2, i -> i * 2);
		List<Integer> collect = infiniteStream.skip(3).limit(5).collect(Collectors.toList());
		System.out.println(collect);
		
		System.out.println("Added a print statement");
		System.out.println("I belongs to develop branch now");
	}

}
