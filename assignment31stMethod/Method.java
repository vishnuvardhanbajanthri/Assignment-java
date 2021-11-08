package assignment31stMethod;

public class Method {
	public static void numbers(int a,int b,int c) {
		if(a==b && b==c) {
			System.out.println("All numbers are eqval");
		}
		else if(a<0||b<0||c<0) {
			System.out.println("Print invalid value ");
		}
		else if(a!=b&&b!=c) {
			System.out.println("All numbers are not eqval or different ");
		}
	}

}
