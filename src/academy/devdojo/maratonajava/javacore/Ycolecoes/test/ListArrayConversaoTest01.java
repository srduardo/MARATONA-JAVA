package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]); // também possível com: Integer[numeros.size()]
        numeros.add(4);                                          // Integer[0] é mais rápido do que Integer[numeros.size()]

        System.out.println(numeros);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("================");

        Integer[] arrayToList = new Integer[3];
        arrayToList[0] = 1;
        arrayToList[1] = 2;
        arrayToList[2] = 3;

        // A conversão é feita com sucesso, mas o array e o list ficam ligados, dificultando os processos de alteração
        List<Integer> list = Arrays.asList(arrayToList);
        list.set(1, 4);
        System.out.println(list);
        System.out.println(Arrays.toString(arrayToList));

        System.out.println("================");

        // A conversão é feita com sucesso, e o array e o list não ficam ligados, facilitando os processos de alteração
        List<Integer> numberList = new ArrayList<>(Arrays.asList(arrayToList));
        numberList.add(5);
        System.out.println(numberList);
        System.out.println(Arrays.toString(arrayToList));
    }
}
