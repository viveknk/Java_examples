package com.viveknk.boxwrap;

public class SampleWrapper {

	public static void main(String[] args) {
		
		int i = 10;
		Integer bi = i;
		
		System.out.println(bi);
		System.out.println(bi.intValue());
		System.out.println(bi.parseInt("100")); // default is decimal
		System.out.println(bi.parseInt("100",10)); //decimal
		System.out.println(bi.parseInt("100",2)); //binary
		
		//Static invocation of parseInt
		System.out.println(Integer.parseInt("100")); // default is decimal
		System.out.println(Integer.parseInt("100",10)); //decimal
		System.out.println(Integer.parseInt("100",2)); //binary
		
		
		long l = 10;
		Long bl = l;
		
		System.out.println(bl);
		System.out.println(bl.longValue());
		System.out.println(bl.intValue());
		System.out.println(bl.parseLong("200")); // default is decimal
		System.out.println(bl.parseLong("200",10)); //decimal
		System.out.println(bl.parseLong("11001000",2)); //binary
		
		double d = 10.0;
		Double bd = d;
		
		System.out.println(bd);
		System.out.println(bd.doubleValue());
		System.out.println(bd.intValue());
		System.out.println(bd.parseDouble("200")); // only whole numbers are supported.
		
		if(i==l) {
			System.out.println("i & l are equal");
		}
		
		//Wrappers cannot be validated with == . They are objects that are not in same inheritance tree
		/*if(bi==bl) {
			System.out.println("bi & bl are equal");
		}*/
		
		if(bi.equals(bl)) {
			System.out.println("bi & bl are equal");
		} else {
			System.out.println("bi & bl are not equal");
			if(bi.intValue() == bl.intValue()) {
				System.out.println("But, bi & bl VALUES are equal");
			}
		}
	}
}
