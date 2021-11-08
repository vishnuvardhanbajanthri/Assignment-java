package com.technoelevate.comparableassignment8th;

import java.util.ArrayList;
import java.util.Collections;

public class TrainerDetails {
	public static void main(String[] args) {
		ArrayList<Trainers> trainers=new ArrayList<Trainers>();
		trainers.add(new Trainers(459, "Rahul", "5years"));
		trainers.add(new Trainers(75, "hari", "3years"));
		trainers.add(new Trainers(77, "gopal", "1year"));
		trainers.add(new Trainers(66, "hamanth", "8years"));
		
		Collections.sort(trainers);
		System.out.println(trainers);
		
		
		ComparaterExampleforTrainer comparaterExampleforTrainer=new ComparaterExampleforTrainer();
		Collections.sort(trainers,comparaterExampleforTrainer);
		System.out.println(trainers);
	}

}
