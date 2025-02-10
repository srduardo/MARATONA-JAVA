package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Streamer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsTest01 {
    private static List<Streamer> list = new ArrayList<>(List.of(
            new Streamer("Coringa", 20000),
            new Streamer("YoDa", 14000),
            new Streamer("BaianoLoL", 16000),
            new Streamer("Minerva", 4000),
            new Streamer("Apenas1react", 300),
            new Streamer("Gaules", 20000),
            new Streamer("Cellbit", 13000),
            new Streamer("Alanzoka", 50000)
    )
    );

    public static void main(String[] args) {

        list.sort(Comparator.comparing(Streamer::getName));
        System.out.println(list);

        List<String> names = new ArrayList<>();

        for (Streamer streamer : list) {
            if (streamer.getViwers() <= 17000) {
                names.add(streamer.getName());
            }

            if (names.size() ==  3) {
                break;
            }
        }

        System.out.println(names);


    }

}
