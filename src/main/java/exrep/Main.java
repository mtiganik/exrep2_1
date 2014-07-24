package exrep;

import java.util.*;

import org.junit.Test;

public class Main {

	@Test
	public void ex1() {
		// new Person("Jack");
		// Util.printHello();
		// printHello();
	}

	@Test
	public void ex2() {
		new Company();
		new Company();
	}

	@Test
	public void ex3() {
		try {
			System.out.println("in try block");
			// throw new RuntimeException();
			// return;
			
		} catch (Exception e) {
			System.out.println("Catched: " + e);
		} finally {
			System.out.println("in finally block");
		}
	}

	@Test
	public void ex4() {
		// Util.readFromFile();
		
		// Util.readFromWeb();
	}

	@Test
	public void ex5() {
		System.out.println(fib(7));
	}

	private Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
	
	private int fib(int n) {
		System.out.println("n = " + n);

		return 0;
	}
	
}
