package org.technoelevate.assignment02;

import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {
		System.out.println("Enter your Age ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<18) {
			System.out.println("Age is less than 18 you are eligible to vote after "+ (18-n)+" years");
		}else {
			System.out.println("you are ready to vote before "+ (n-18)+ " years ");
		}
	}
}
