package org.technoelevate.collegues;

import java.util.ArrayList;
import java.util.Collections;

public class Colleguesdata {
	public static void main(String[] args) {
		ArrayList<collegues> arrayList=new ArrayList<collegues>();
		arrayList.add(new collegues(54, "Naresh", "Friend"));
		arrayList.add(new collegues(77, "banu", "Friend"));
		arrayList.add(new collegues(61, "harish", "BestFriend"));
		arrayList.add(new collegues(55, "ramesh", "Friend"));
		arrayList.add(new collegues(81, "hari", "NotFriend"));
		
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		comparaterexample comparaterexample=new comparaterexample();
		Collections.sort(arrayList, comparaterexample);
		System.out.println(arrayList);
		
	}

}
