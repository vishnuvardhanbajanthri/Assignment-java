package com.technoelevate.assignment1111;

public class Freshlite03R implements Runnable {

	@Override
	public void run() {
		Thread.currentThread().setPriority(2);
		Thread.currentThread().setName("Freshlite03 react batch");
		System.out.println(Thread.currentThread().getName());
		System.out.println("freshlite03 react batch priority = "+Thread.currentThread().getPriority());
		
		
		
		for(int i=0;i<10;i++) {
			System.out.println("Freshlite03 react thread");
		}
		
	}

}
