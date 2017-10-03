package com.rk.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMap {
	public static void main(String[] args) {
		Stream<List<String>> namesOriginalList = Stream.of(
				Arrays.asList("Pankaj", "123"), 
				Arrays.asList("David", "Lisa"),
				Arrays.asList("Amit"));

		// flat the stream from List<String> to String stream
		Stream<String> flatStream = namesOriginalList.flatMap(strList -> strList.stream());

		flatStream.forEach(System.out::println);

	}

}
