package org.technoelevate.assignment02;

public class ArthematicException {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println(c);
	}
}

/* Exception in thread "main" java.lang.ArithmeticException: / by zero
	at org.technoelevate.assignment02.ArthematicException.main(ArthematicException.java:7)
   */