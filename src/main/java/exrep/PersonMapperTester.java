package exrep;

public class PersonMapperTester {

    public static void main(String[] args) {

        PersonMapper mapper = new PersonMapper();

        Person person = mapper.parse("{ \"name\": \"Jill\" }");
                                   // { "name": "Jill" }

        System.out.println(person);

        String dataAsString = mapper.stringify(person);

        System.out.println(dataAsString);

    }

}
