package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Streamer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest03 {
    private static List<Streamer> list = new ArrayList<>(List.of(
            new Streamer("Coringa", 20000),
            new Streamer("YoDa", 14000),
            new Streamer("BaianoLoL", 16000),
            new Streamer("Minerva", 4000),
            new Streamer("Apenas1react", 300),
            new Streamer("Apenas1react", 300),
            new Streamer("Gaules", 20000),
            new Streamer("Cellbit", 13000),
            new Streamer("Alanzoka", 50000)
    )
    );

    public static void main(String[] args) {

        Stream<Streamer> stream = list.stream();

        long count = stream.filter(streamer -> streamer.getViwers() <= 16000).count();
        System.out.println(count);
        long count1 = list.stream().filter(streamer -> streamer.getViwers() <= 16000).distinct().count();
        System.out.println(count1);

    }
}
