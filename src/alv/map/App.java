package alv.map;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map map = new HashMap<String, String>();
        map.put("Saludo", "Hola");
        map.put("Despedida", "Adios");

        System.out.printf("%s ", map.keySet());
        System.out.println();
        System.out.printf("%s ", map.values());
        System.out.println();
    }
}