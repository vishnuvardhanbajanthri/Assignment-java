package org.technoelevate.assignment02;

public class StringOutOfBounceException {
	public static void main(String[] args) {
		String a="Hello i am Vishnu";
		char c= a.charAt(50);
	}

}


/*  Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 50
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
	at java.base/java.lang.String.charAt(String.java:1512)
	at org.technoelevate.assignment02.StringOutOfBounceException.main(StringOutOfBounceException.java:6)
 */