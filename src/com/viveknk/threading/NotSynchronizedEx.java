package com.viveknk.threading;

class PrintDemoN {
	   
	public void printCount(){
	    try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println("Counter   ---   "  + i );
	         }
	     } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	     }
	}
}

class ThreadDemoN extends Thread {

	private Thread t;
	private String threadName;
	PrintDemoN  PD;

	ThreadDemoN( String name,  PrintDemoN pd){
	   threadName = name;
	   PD = pd;
	}
	
	public void run() {
	   PD.printCount();
	   System.out.println("Thread " +  threadName + " exiting.");
	}

	public void start () {
	   System.out.println("Starting " +  threadName );
	   if (t == null) {
	      t = new Thread (this, threadName);
	      t.start ();
	   }
	}
}

public class NotSynchronizedEx extends Thread {
	
	public static void main(String[] args) {
		
		  PrintDemoN PD = new PrintDemoN();

	      ThreadDemoN T1 = new ThreadDemoN( "Thread - 1 ", PD );
	      ThreadDemoN T2 = new ThreadDemoN( "Thread - 2 ", PD );

	      T1.start();
	      T2.start();

	      // wait for threads to end
	      try {
	         T1.join();
	         T2.join();
	      } catch( Exception e) {
	         System.out.println("Interrupted");
	      }
	}
}