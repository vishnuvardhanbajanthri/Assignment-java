package com.technoelevate.assignment1111;

public class MainBatch {

	public static void main(String[] args) {
		
		Freshlite03J freshlite03j= new Freshlite03J();
		freshlite03j.setPriority(7);
		freshlite03j.setName("Freshlite03 java batch");
		System.out.println(freshlite03j.getName());
		System.out.println("Freshlite03 java batch priority = "+freshlite03j.getPriority());
		Freshlite03R freshlite03r= new Freshlite03R();
		Thread thread= new Thread(freshlite03r);
		Thread.currentThread().setName("main thread");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(2);
		System.out.println("main thread priority = "+Thread.currentThread().getPriority());
		thread.start();
		freshlite03j.start();
	}

}
