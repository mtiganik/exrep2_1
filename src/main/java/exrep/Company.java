package exrep;

public class Company {
	
	static {
		System.out.println("in static block");
	}

	public static void staticMethod(){
		System.out.println("in static method");
	}
	
	public Company() {
		System.out.println("in Company constructor");
	}
}

