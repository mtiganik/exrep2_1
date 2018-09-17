package exrep;

import java.util.HashMap;

public class DataStore {

    private static HashMap hashMap = new HashMap();

    public static void store(String key, String value) {
        hashMap.put(key,value);
    }

    public static String get(String key) {
        return hashMap.get(key).toString();
    }
}
