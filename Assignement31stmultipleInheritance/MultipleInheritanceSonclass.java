package Assignement31stmultipleInheritance;

public class MultipleInheritanceSonclass extends MultipleInheritanceFatherclass {
	void playing() {
		System.out.println("I am Playing ");
	}
	public static void main(String[] args) {
	MultipleInheritanceSonclass sonclass=new MultipleInheritanceSonclass();
	sonclass.Grandfathercares();
	sonclass.Fathercares();
	sonclass.playing();
	}
	
}
