package com.training.cg;

public class DeadLockDemo {
	
		public static Object Lock1=new Object(); 
		public static Object Lock2=new Object(); 
		public static void main(String args[]) {
		SynchronizeDemo1 t1 = new SynchronizeDemo1();
		SynchronizeDemo2 t2 = new SynchronizeDemo2();
		t1.start();
		
		t2.start();
		
	}
		private static class ThreadDemo1 extends Thread {
		public void run() {
			synchronized(Lock1){
			System.out.println("Thread1 : holding lock 1..");
		
		try {
			Thread.sleep(2000);}
		
		catch(InterruptedExeception e) {}
		
		
		System.out.println("Thread 1: waiting for lock 2..");
		
		synchronized(Lock2) {
			System.out.println("Thread1 : holding lock 1 and lock 2");
		}

		}
}
		}
		private static class ThreadDemo2 extends Thread {
			public void run() {
				synchronized(Lock2){
				System.out.println("Thread2 : holding lock 2..");
			
			try {
				Thread.sleep(20);}
			
			catch(InterruptedExeception e) {}
			;
			
			System.out.println("Thread 2: waiting for lock 1..");
			
			synchronized(Lock1) {
				System.out.println("Thread2 : holding lock 1 and lock 2");
			}
				}
			}
		}
}
//wait,join,notify,notifyAll
		
