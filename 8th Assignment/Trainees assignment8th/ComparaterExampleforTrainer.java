package com.technoelevate.comparableassignment8th;

import java.util.Comparator;

public class ComparaterExampleforTrainer implements Comparator<Trainers>{

	@Override
	public int compare(Trainers o1, Trainers o2) {
		return o2.experiance.compareTo(o1.experiance);
	}

}
