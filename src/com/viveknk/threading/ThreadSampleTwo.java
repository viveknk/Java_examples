package com.viveknk.threading;

public class ThreadSampleTwo implements Runnable {

	@Override
	public void run() {
		
		System.out.println("I'm the run method");
	}
	
	public static void main(String[] args) {
		
		ThreadSampleTwo target = new ThreadSampleTwo();
		
		//pass the runnable object to the thread constructor
		Thread th = new Thread(target);
		
		//start the thread - but the "run" method of the target is called
		th.start();
	}
}
