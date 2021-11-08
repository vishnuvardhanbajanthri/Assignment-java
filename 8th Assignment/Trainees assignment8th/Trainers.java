package com.technoelevate.comparableassignment8th;

public class Trainers implements Comparable<Trainers> {
	int id;
	String name;
	String  experiance;
	public Trainers(int id, String name, String experiance) {
		super();
		this.id = id;
		this.name = name;
		this.experiance = experiance;
	}
	@Override
	public String toString() {
		return "Trainers [id=" + id + ", name=" + name + ", experiance=" + experiance + "]";
	}
	@Override
	public int compareTo(Trainers o) {
		return this.experiance.compareTo(o.experiance);
	}
	
	

}
