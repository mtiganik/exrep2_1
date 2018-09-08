package exrep;

public class DataStoreTester {

    public static void main(String[] args) {

        DataStore.store("key1", "value1");
        DataStore.store("key2", "value2");

        System.out.println(DataStore.get("key1")); // peaks printima value1

        System.out.println(DataStore.get("key2")); // peaks printima value2
    }

}
