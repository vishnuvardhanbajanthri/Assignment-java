package assignment31stMethod;

import java.util.Scanner;

public class ForStatement {
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i+" ");
				count++;
				if(count>=5) {
					break;
				}
			}
		}
		
	}
		
}
