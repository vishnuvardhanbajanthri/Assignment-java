package org.technoelevate.assignment31st;

import java.util.Scanner;

public class DifferenciateIntigers {
	public static void main(String[] args) {
		System.out.println("Eneter the size of Array  ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the "+n+" numbers ");
		int array[]=new int[n];
		int PossitiveNumbers=0;
		int Negativenumbers=0;
		int oddnumber=0;
		int evennumber=0;
		int zero=0;
		for(int i=0;i<n;i++) {
			int numbers= sc.nextInt();
			array[i]=numbers;
			if(array[i]>=0) {
				PossitiveNumbers++;
			}
			else
			{
				Negativenumbers++;
			}
			if(n%2==0) {
				evennumber++;
			}
			else {
				oddnumber++;
			}
			if(n==0) {
				zero++;
			}
		}
		System.out.println("Number of possitive number presented or "+PossitiveNumbers);
		System.out.println("Number of Negative number presented or "+Negativenumbers);
		System.out.println("Number of Even number presented or "+evennumber);
		System.out.println("Number of Odd number presented or "+oddnumber);
		System.out.println("Number of zeros  presented or "+zero);
	}

}
