package com.training.cg;

public class SynchronizeDemo1 extends Thread{
	public static Object Lock1=new Object(); 
	public static Object Lock2=new Object(); 
	@Override
	public void run() {
		synchronized(Lock1){
		System.out.println("Thread1 : holding lock 1..");
	
	try {
		Thread.sleep(2000);
	}
	catch(InterruptedExeception e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Thread 1: waiting for lock 1..");
	
	synchronized(Lock2) {
		System.out.println("Thread1 : holding lock 1 and lock 2");
	}

}
}
}

