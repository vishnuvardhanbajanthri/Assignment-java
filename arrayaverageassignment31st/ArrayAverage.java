package arrayaverageassignment31st;

import java.util.Scanner;

public class ArrayAverage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter the array values ");
		for(int i=0;i<size;i++) {
			int values=sc.nextInt();
			arr[i]=values;
		}
		int length=arr.length;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		double average=sum/length;
		System.out.println(average);
		
	}

}

/*  o/p:-
 
 7
Enter the array values 
20
30
25
35
-16
60
-100
7.0

*/
