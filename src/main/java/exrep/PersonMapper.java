package exrep;

public class PersonMapper {

    public Person parse(String input) {
        return new Person(input);


       // throw new RuntimeException("not implemented yet");
    }

    public String stringify(Person person) {
        return person.getName();
        //throw new RuntimeException("not implemented yet");
    }
}
