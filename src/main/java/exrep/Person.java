package exrep;

import java.util.List;

public class Person {

    private String name;

    private Integer age;

    public Person(String inputString) {
        System.out.println(inputString);


        inputString = inputString.replace("{","");
        inputString = inputString.replace("}","");
        inputString = inputString.replace("\"","");
        //if(inputString.contains(",")){

        // }
        String[] inputElements = inputString.split(",");
       // for(String inputElements)


        System.out.println(inputString);

        this.name = inputString;
    }

    public Person(Integer age, String name){
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
