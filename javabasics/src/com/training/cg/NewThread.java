package com.training.cg;

public class NewThread extends Thread{
	private Thread t;
	private String threadName;
	
	NewThread(String name){
		threadName = name;
	}
	@Override
	public void run() {
		System.out.println(threadName +": is running");
		for(int i=4;i>0;i--) {
			System.out.println("Thread" +threadName +","+i);
			try{
				Thread.sleep(5000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		System.out.println("Thread"+threadName+"exiting");
		}
		}
	}
	

 
public void go() {
	// TODO Auto-generated method stub
	  t=new Thread(this,threadName);
	  t.start();

}
}