package com.viveknk.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(4);
		list.add(3);
		list.add(9);
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(8);
		list.add(7);
		
		System.out.println("Before sorting...");
		for(int i : list) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("after sorting..");
		
		Collections.sort(list);
		for(int i : list) {
			System.out.println(i);
		}
	}
}
