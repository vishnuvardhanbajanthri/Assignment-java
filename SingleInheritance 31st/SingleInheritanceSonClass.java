package Assignment31stoct;

public class SingleInheritanceSonClass extends SingleInheritanceFatherClass {
	void Playing() {
		System.out.println("Playing games ");
	}
	public static void main(String[] args) {
		SingleInheritanceSonClass class2=new SingleInheritanceSonClass();
		class2.Dadcares();
		class2.Playing();
		
	}

}
