package alv.hashmaps;

import java.util.HashMap;

public class App{
static HashMap<String, Boolean> map = new HashMap<String, Boolean>();
    public static void main(String[] args) {
        map.put("Kenny", true);
        map.put("Joe", false);

        System.out.println(map.get("Kenny"));
    }
}