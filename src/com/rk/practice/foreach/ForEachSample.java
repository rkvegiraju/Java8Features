package com.rk.practice.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachSample {

	public static void main(String[] args) {
		List<Integer> list = createList();
		traverseWithIterator(list);
		System.out.println();
		traverseWithAnonymousConsumer(list);
		System.out.println();
		traverseWithCustomConsumer(list);
	}
	
	public static void traverseWithCustomConsumer(List<Integer> list) {
		if (list == null) {
			return;
		}

		list.forEach(new MyConsumer());
		
	}
	public static void traverseWithAnonymousConsumer(List<Integer> list) {
		if (list == null) {
			return;
		}

		list.forEach(new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.print(i + " ");
			}
		});
		
	}
	
	public static void traverseWithIterator(List<Integer> list) {
		if (list == null || list.size() == 0) {
			return;
		}
		
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
	
	public static List<Integer> createList() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <=10; i++) {
			list.add(i);
		}
		return list;
	}
}

class MyConsumer implements Consumer<Integer> {
	public void accept(Integer i) {
		System.out.print(i + " ");
	}
}
