package org.technoelevate.assignment02;

public class NumberFormatException {
	public static void main(String[] args) {
		int a= Integer.parseInt("Hello");
	}

}


/* Exception in thread "main" java.lang.NumberFormatException: For input string: "Hello"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:786)
	at org.technoelevate.assignment02.NumberFormatException.main(NumberFormatException.java:5)
 */