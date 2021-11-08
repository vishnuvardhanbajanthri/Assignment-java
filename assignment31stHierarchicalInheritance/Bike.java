package org.technoelevate.assignment31stHierarchicalInheritance;

public class Bike extends Vehical {
	void Bikes() {
		System.out.println("This is Bike classe ");
	}
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.vehicles();
		bike.Bikes();
	}
}
