package com.rk.practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToCollections {
	public static void main(String[] args) {
		List<Integer> list = createList();
		
		Stream<Integer> stream = list.stream();

		// TO List
		List<Integer> intList = stream.collect(Collectors.toList());
		intList.forEach(p -> System.out.print(p + " "));
		
		System.out.println();
		stream = list.stream();
		
		// TO Map
		Map<Integer, Integer> map = stream.collect(Collectors.toMap(p -> p, p -> p + 10));
		map.forEach((i, j) -> System.out.println(i + " - " + j));
		
		System.out.println();
		stream = list.stream();
		
		// TO Set
		Set<Integer> set = stream.collect(Collectors.toSet());
		set.forEach(p -> System.out.print(p + " "));

		System.out.println();
		stream = list.stream();
		
		// TO Array
		Integer[] arr = stream.toArray(Integer[]::new);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static List<Integer> createList() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 10; i > 0; i--) {
			list.add(i);
		}
		return list;
	}
}
