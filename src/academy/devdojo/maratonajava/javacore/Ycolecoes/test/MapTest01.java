package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); // LinkedHashMap mantém a ordem em que os elementos foram adicionados

        map.put("chave 1", "valor 1");
        map.put("chave 2", "valor 2");
        map.put("chave 3", "valor 3");
        map.putIfAbsent("chave 3", "valor 4"); // Adiciona apenas se não existir

        Set<String> keySet = map.keySet(); // Retorna um Set com as chaves/keys do map
        Collection<String> valueSet = map.values(); // Retorna uma Collection dos valores/values do map

        for (String key : map.keySet()) {
            String value = map.get(key); // Retorna o valor da chave
            System.out.println(key + " : " + value);
        }

        System.out.println("=============");

        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("=============");

        for (Map.Entry<String, String> entry : map.entrySet()) { // Map.Entry = Objeto que contém as chaves e valores de um map
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
