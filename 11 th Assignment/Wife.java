package com.technoelevate.multithreading;

public class Wife extends Thread {

Account acc;
	
	public Wife(Account acc) {
		super();
		this.acc = acc;
	}
	
	
	@Override
	public void run() {
		
		Thread.currentThread().setName("Wife thread");
		System.out.println(Thread.currentThread().getName());
		try{
			Thread.sleep(1000);
			acc.deposite(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}


