package assignment31stMethod;

public class MethodoverloadingCircle {
	double a;
	double b;
	void radious(double a) {
		if(a>0) {
			System.out.println("Radious of circle is "+a);
		}
		else {
			System.out.println("Radious of circle "+a+" is negative ");
		}
	}
	void radious(double a,double b) {
		if(a>0&&b>0) {
			System.out.println("Radious of Rectangle is "+a);
			System.out.println("Radious of Rectangle is "+b);
		}
		else if(a>0&&b<0||a<0&&b>0){
			System.out.println("Radious of Rectangle is -1.0");
		}
		else {
			System.out.println("Radious of Rectangle is -1.0");
		}
	}
	public static void main(String[] args) {
			MethodoverloadingCircle circle=new MethodoverloadingCircle();
			circle.radious(-44.5);
			circle.radious(35.8, -44.5);
	}
}
