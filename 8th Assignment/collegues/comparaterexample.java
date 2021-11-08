package org.technoelevate.collegues;

import java.util.Comparator;

public class comparaterexample implements Comparator<collegues> {

	@Override
	public int compare(collegues o1, collegues o2) {
		return o2.relation.compareTo(o1.relation);
	}
	

}
