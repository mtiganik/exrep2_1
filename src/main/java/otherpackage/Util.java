package otherpackage;

public class Util {

	public static void printHello() {
		System.out.println("hello");
	}

	public static String readFromFile() {
		throw new RuntimeException("File not found");
	}

	public static String readFromWeb() throws Exception {
		throw new Exception("Can't connect");
	}
	
}
