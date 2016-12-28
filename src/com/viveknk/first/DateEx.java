package com.viveknk.first;

import java.util.Calendar;
import java.util.Date;

import com.viveknk.utils.Print;

public class DateEx {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		long millis=System.currentTimeMillis();  
		Date date2 = new Date(millis);
		System.out.println(date2);
		
		Print.printbr();
		
		java.sql.Date sql_date=new java.sql.Date(millis);  
		System.out.println(sql_date);
		
		Print.printbr();
		
		Date caldate = Calendar.getInstance().getTime();  
		System.out.println(caldate);
	}
}
