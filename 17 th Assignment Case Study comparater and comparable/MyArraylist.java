package com.technoelevate.studentscasestudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyArraylist {
	public static void main(String[] args) {
		List<Students> list = new ArrayList<Students>();
		list.add(new Students(05, "Avinash", 85, 458761284945l, "Male", 23));
		list.add(new Students(10, "Vishnu", 60, 789456123l, "Male", 24));
		list.add(new Students(15, "Praveen", 70, 48579125464l, "Male", 22));
		list.add(new Students(30, "Hari", 80, 8457912364l, "Girl", 20));
		
		mainMenu(list);
		
		

	}
	 public static void exit() {
		System.out.println("Thank you ");
	}
	private static void mainMenu(List<Students> list) {
		System.out.println(
				"press 1 to sort by id \npress 2 to sort by name\npress 3 to sort by percentage\npress 4 to sort by phone number \npress 5 to sort by Gender \npress 6 to sort by age  ");
		System.out.println();
		System.out.println("please select one number to sort as per your reqvired ");
		Scanner sc = new Scanner(System.in);
		int sel =sc.nextInt();
		
		switch (sel) {
		case 1:
			Collections.sort(list,Students.comparator);
			for (Students students : list) {
				System.out.println(students);
			}
			System.out.println();
			System.out.println("Please select 1 to go for main minu or 0 to exit ");
			int n = sc.nextInt();
			if(n==1) 
				mainMenu(list);
			else
				exit();
			break;
			
		case 2:
			Collections.sort(list,Students.comparator2);
			for (Students students : list) {
				System.out.println(students);
			}
			System.out.println();
			System.out.println("Please select 1 to go for main minu or 0 to exit ");
			int n1 = sc.nextInt();
			if(n1==1) 
				mainMenu(list);
			else
				exit();
			break;
		case 3:
			Collections.sort(list,Students.comparator3);
			for (Students students : list) {
				System.out.println(students);
			}
			System.out.println();
			System.out.println("Please select 1 to go for main minu or 0 to exit ");
			int n3 = sc.nextInt();
			if(n3==1) 
				mainMenu(list);
			else
				exit();
			break;
		case 4:
			Collections.sort(list,Students.comparator4);
			for (Students students : list) {
				System.out.println(students);
			}
			System.out.println();
			System.out.println("Please select 1 to go for main minu or 0 to exit ");
			int n4 = sc.nextInt();
			if(n4==1) 
				mainMenu(list);
			else
				exit();
			break;
		case 5:
			Collections.sort(list,Students.comparator5);
			for (Students students : list) {
				System.out.println(students);
			}
			System.out.println();
			System.out.println("Please select 1 to go for main minu or 0 to exit ");
			int n5 = sc.nextInt();
			if(n5==1) 
				mainMenu(list);
			else
				exit();
			break;
		case 6:
			Collections.sort(list,Students.comparator6);
			for (Students students : list) {
				System.out.println(students);
			}
			System.out.println();
			System.out.println("Please select 1 to go for main minu or 0 to exit ");
			int n6 = sc.nextInt();
			if(n6==1) 
				mainMenu(list);
			else
				exit();
			break;	
			
		default :
			System.out.println("This is undefined ");
			break;
		}
		
	}
}
