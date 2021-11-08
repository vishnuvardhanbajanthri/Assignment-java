package org.technoelevate.assignment02;

public class NullPointerException {
	public static void main(String[] args) {
		String a=null;
		System.out.println(a.charAt(1));
	}
}




/* Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "a" is null
	at org.technoelevate.assignment02.NullPointerException.main(NullPointerException.java:6)
 */
