package com.viveknk.threading;

public class ThreadSampleOne extends Thread {
	
	public static void main(String[] args) {
		
		ThreadSampleOne one = new ThreadSampleOne();
		one.start(); //nothing happens since we have not overridden it
	}
}
