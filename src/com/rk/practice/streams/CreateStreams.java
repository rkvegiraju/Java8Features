package com.rk.practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStreams {
	public static void main(String[] args) {
		List<Integer> list = createList();
		list.add(2);
		
		createStreams();
	}
	
	public static void createStreams() {
		// 1. Stream.of
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
		stream.forEach(p -> System.out.print(p + " "));
		
		System.out.println();
		
		// 2. Stream.of
		stream = Stream.of(new Integer[] {6, 5, 4, 3, 2, 1});
		stream.forEach(p -> System.out.print(p + " "));
		
		System.out.println();
		
		// 3. List.stream
		List<Integer> list = createList();
		list.stream().forEach(p -> System.out.print(p + " "));
		
		System.out.println();
		
		// 4. Parallel Stream
		list.parallelStream().forEach(p -> System.out.print(p + " "));
		
		System.out.println();
		
		// 5. Stream.generate and Stream.iterate
		Stream<String> stream1 = Stream.generate(() -> {
			return "abc";
		});
		
		// stream1.forEach(p -> System.out.println(p));
		
		Stream<String> stream2 = Stream.iterate("abc", (i) -> i);
		// stream2.forEach(p -> System.out.println(p));
		
		System.out.println();
		
		// 6. LongStream
		LongStream longStream = Arrays.stream(new long[] {1, 2, 3}); 
		longStream.forEach(p -> System.out.print(p + " "));
		
		System.out.println();
		
		// 7. IntStream
		IntStream intStream = "abc".chars();
		intStream.forEach(p -> System.out.print(p));
	}
	
	public static List<Integer> createList() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 10; i > 0; i--) {
			list.add(i);
		}
		return list;
	}
}
