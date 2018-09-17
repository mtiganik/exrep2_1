package exrep;


import java.util.List;

public class Person {

    private String name;

    private Integer age;

    public Person(String inputString) {

        // Some checks that input is not in JSON format
        if(!inputString.contains("{") || !inputString.contains(":")){
            this.name = inputString;
        }else {


            inputString = inputString.replace("{", "");
            inputString = inputString.replace("}", "");
            inputString = inputString.replace("\"", "");

            String[] inputElements = inputString.split(",");
            for (int i = 0; i < inputElements.length; i++) {
                inputElements[i] = inputElements[i].trim();
                if (inputElements[i].startsWith("name")) {
                    this.name = inputElements[i].replace("name:", "").trim();
                }
                if (inputElements[i].startsWith("age")) {
                    this.age = Integer.parseInt(inputElements[i].replace("age:", ""));
                }
            }
        }

        //System.out.println("age: " + this.age);
        //System.out.println("name: " + this.name);
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
