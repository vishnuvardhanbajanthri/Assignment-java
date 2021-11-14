package com.technoelevate.assignment1111;

public class Freshlite03J extends Thread {

	@Override 
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hi everyone welcome to \"TestYantra\"");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
