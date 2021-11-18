package com.technoelevate.studentscasestudy;

import java.util.Comparator;

public class Students {
	private int id;
	private String name;
	private int marks;
	private long phonenumber;
	private String gender;
	private int age;

	public Students(int id, String name, int marks, long phonenumber, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.phonenumber = phonenumber;
		this.gender = gender;
		this.age = age;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static Comparator<Students> comparator = new Comparator<Students>() {

		@Override
		public int compare(Students o1, Students o2) {
			return o1.getId()-o2.getId();
		}
	};
	
	public static Comparator<Students> comparator2 = new Comparator<Students>() {

		@Override
		public int compare(Students o1, Students o2) {

			return o1.getName().compareTo(o1.getName());
		}
	};
	
	public static Comparator<Students> comparator3 = new Comparator<Students>() {

		@Override
		public int compare(Students o1, Students o2) {
			return o1.getMarks()-o2.getMarks();
		}
	};
	
	public static Comparator<Students> comparator4=new Comparator<Students>() {
		
		@Override
		public int compare(Students o1, Students o2) {
			return (int) (o1.getPhonenumber()-o2.getPhonenumber());
		}
	};
	
	public static Comparator<Students> comparator5=new Comparator<Students>() {
		
		@Override
		public int compare(Students o1, Students o2) {
			
			return o1.getGender().compareTo(o2.getGender());
		}
	};
	
	public static Comparator<Students> comparator6=new Comparator<Students>() {
		
		@Override
		public int compare(Students o1, Students o2) {
			return o1.getAge()-o2.getAge();
		}
	};
	
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", marks=" + marks + ", phonenumber=" + phonenumber
				+ ", gender=" + gender + ", age=" + age + "]";
	}

}


		
