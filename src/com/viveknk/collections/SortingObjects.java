package com.viveknk.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingObjects {

	public static void main(String[] args) {
		
		Chocolate c1 = new Chocolate();
		Chocolate c2 = new Chocolate(20);
		Chocolate c3 = new Chocolate(3);
		Chocolate c4 = new Chocolate(7);
		Chocolate c5 = new Chocolate(14);
		
		List<Chocolate> list = new ArrayList<Chocolate>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		
		System.out.println("Before sorting...");
		for(Chocolate c : list) {
			System.out.println(c.size);
		}
		
		System.out.println();
		System.out.println("after sorting..");
		
		Collections.sort(list);
		for(Chocolate c : list) {
			System.out.println(c.size);
		}
	}
}

class Chocolate implements Comparable {
	
	int size = 10;
	
	Chocolate() {
		
	}
	
	Chocolate(int s) {
		size = s;
	}
	
	public boolean equals(Chocolate c) {
		
		if(this.size == c.size) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Object o) {
		
		if(o instanceof Chocolate) {
			return size - ((Chocolate)o).size;
		} else {
			return 1;
		}
	}
}
