package org.technoelevate.assignment8th;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(10);
		integers.add(33);
		integers.add(89);
		integers.add(77);
		integers.add(55);
		integers = Collections.synchronizedList(integers);
		synchronized (integers) {
			Iterator itr = integers.listIterator();
			while (itr.hasNext()) {
				Object object = (Object) itr.next();
				System.out.println(object);
			}
		}
	}
}
