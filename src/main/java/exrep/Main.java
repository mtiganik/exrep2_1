package exrep;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Main {

    @Test
    public void ex1a() {
        new Company();
        new Company();
    }

    @Test
    public void ex1b() {

        try {
            // do sth
        } catch (Exception e) {
            e.printStackTrace();

            throw e;
        }
    }

    @Test
    public void ex1c() {
        // Util.readFromFile();

        // Util.readFromWeb();
    }

    @Test
    public void ex1d() {
        List<Person> persons1 = Arrays.asList(new Person("Jill"), new Person("Jack"));
        List persons2 = Arrays.asList(new Person("Jane"), new Person("Jim"));

        // käia üle listi elementide ja printida nimed
    }


}
