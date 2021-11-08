package org.technoelevate.collegues;

public class collegues implements Comparable<collegues> {
	int id;
	String name;
	String relation;
	public collegues(int id, String name, String relation) {
		super();
		this.id = id;
		this.name = name;
		this.relation = relation;
	}
	@Override
	public String toString() {
		return "collegues [id=" + id + ", name=" + name + ", relation=" + relation + "]";
	}
	@Override
	public int compareTo(collegues o) {
		return this.relation.compareTo(o.relation);
	}
	

}
