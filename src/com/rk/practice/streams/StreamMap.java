package com.rk.practice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// TO modify the data
public class StreamMap {
	public static void main(String[] args) {
		List<Integer> list = createList();
		
		Stream<Integer> stream = list.stream();
		stream = stream.map(p -> p + 10);
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
