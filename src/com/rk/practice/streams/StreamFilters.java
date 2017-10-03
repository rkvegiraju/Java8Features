package com.rk.practice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilters {
	public static void main(String[] args) {
		List<Integer> list = createList();
		Stream<Integer> stream = list.stream();
		stream = stream.filter(p -> p > 5);
		stream.forEach(p -> System.out.print(p + " "));
		
		System.out.println();
		
		stream = list.stream();
		
	}
		
	public static List<Integer> createList() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 10; i > 0; i--) {
			list.add(i);
		}
		return list;
	}
}
