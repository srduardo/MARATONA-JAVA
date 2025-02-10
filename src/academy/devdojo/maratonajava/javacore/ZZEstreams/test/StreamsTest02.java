package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Streamer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest02 {
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
        List<String> collect = list.stream()
                .sorted(Comparator.comparing(Streamer::getName))
                .filter(st -> st.getViwers() < 16000)
                .limit(3)
                .map(Streamer::getName)
                .collect(Collectors.toList());

        System.out.println(collect);
    }

}
