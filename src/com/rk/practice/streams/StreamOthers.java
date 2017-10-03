package com.rk.practice.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

// TO modify the data
public class StreamOthers {
	public static void main(String[] args) {
		List<Integer> list = createList();

		Stream<Integer> stream = list.stream();
		
		// SORT
		stream = stream.sorted(Collections.reverseOrder());
		stream.forEach(p -> System.out.print(p + " "));
		
		System.out.println();
		stream = list.stream();
		
		// COUNT
		System.out.println("Count: " + stream.count());
		
		// Match
		System.out.println();
		stream = list.stream();
		System.out.println("AnyMatch: " + stream.anyMatch(p -> p == 5));

		System.out.println();
		stream = list.stream();
		System.out.println("AllMatch: " + stream.allMatch(p -> p == 5));

		System.out.println();
		stream = list.stream();
		System.out.println("NoneMatch: " + stream.noneMatch(p -> p == 0));
	}
		
	public static List<Integer> createList() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 10; i > 0; i--) {
			list.add(i);
		}
		return list;
	}
}
