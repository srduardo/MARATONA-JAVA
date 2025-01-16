package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>(); // Você pode passar um comparator nos parâmetros do TreeMap<>(aqui)
        map.put("A", "Letra A");
        map.put("E", "Letra E");
        map.put("B", "Letra B");
        map.put("D", "Letra D");
        map.put("C", "Letra C");

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(map.headMap("C", true).higherKey("B")); // Mesmos metodos do NavigableSet, além do headMap()
    }
}
