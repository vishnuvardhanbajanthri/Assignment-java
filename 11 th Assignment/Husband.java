package com.technoelevate.multithreading;

public class Husband extends Thread {

	Account acc;
	
	public Husband(Account acc) {
		super();
		this.acc = acc;
	}
	
	
	@Override
	public void run() {
		
		Thread.currentThread().setName("Husband thread");
		System.out.println(Thread.currentThread().getName());
		try{
			Thread.sleep(1000);
			acc.deposite(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
