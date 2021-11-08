package reversethenumber;

import java.util.Scanner;

public class ReverseTheString {
	public static void main(String[] args) {
		String s[]=" I AM Vishnu".split(" ");
		String ans="";
		for(int i=s.length-1;i>=0;i--) {
			ans=ans+s[i]+" ";
		}
		System.out.println(ans);
	
	}
}
