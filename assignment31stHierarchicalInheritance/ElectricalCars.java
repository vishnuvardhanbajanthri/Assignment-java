package org.technoelevate.assignment31stHierarchicalInheritance;

public class ElectricalCars extends car {
	void Electriccars() {
		System.out.println("This is Electric cars class ");
	}
	public static void main(String[] args) {
		ElectricalCars cars=new ElectricalCars();
		cars.vehicles();
		cars.Cars();
		cars.Electriccars();
	}

}
