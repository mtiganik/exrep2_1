package exrep;

import org.junit.Test;

public class Main {

    @Test
    public void ex1() {
        new Company();
        new Company();
    }

    @Test
    public void ex2() {
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
    public void ex3() {
        // Util.readFromFile();

        // Util.readFromWeb();
    }

    @Test
    public void ex4() {
        System.out.println(fib(7));
    }

    private int fib(int n) {
        System.out.println("fib(" + n + ")");

        return 0;
    }

}
