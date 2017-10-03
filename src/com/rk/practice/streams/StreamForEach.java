package com.rk.practice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamForEach {
	public static void main(String[] args) {
		List<Integer> list = createList();
		list.add(2);
		
		testStreamsForEach(list);
	}
	
	public static void testStreamsForEach(List<Integer> list) {
		// Sequential Stream - for sequential execution
		Stream<Integer> seqStream = list.stream();
		
		// forEach with Lambda expression - Consumer.accept
		seqStream.forEach(p -> System.out.print(p + " "));
		
		System.out.println();
		seqStream = list.stream();
		seqStream.forEachOrdered(p -> System.out.print(p + " "));
		
		System.out.println();
		// Parallel Stream - for parallel execution (not in order)
		Stream<Integer> parStream = list.parallelStream();
		parStream.forEach(p -> System.out.print(p + " "));
	}
		
	public static List<Integer> createList() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 10; i > 0; i--) {
			list.add(i);
		}
		return list;
	}
}
