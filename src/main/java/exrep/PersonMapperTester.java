package exrep;

public class PersonMapperTester {

    public static void main(String[] args) {

        PersonMapper mapper = new PersonMapper();

        Person person = mapper.parse("{ \"age\":20,\"name\": \"Jill\" }");
        Person person2 = mapper.parse("Mihkel");
        Person person3 = mapper.parse("{\"name\": \"Kristi\"");

        System.out.println(person.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());
// "{ \"age\":20,\"name\": \"Jill\" }"

                                   // { "name": "Jill" }

        //    "{ "name": "Jill" }"
        //    "{ \"name\": \"Jill\" }"
        //  {"age":20,"name":"Jill"}

        //System.out.println(person);

        //String dataAsString = mapper.stringify(person);

       // System.out.println(dataAsString);

    }

}
