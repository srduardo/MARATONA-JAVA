
package academy.devdojo.maratonajava.javacore.ZZEstreams.first_test;

    import academy.devdojo.maratonajava.javacore.ZZEstreams.first_domain.Streamer;

    import java.util.ArrayList;
    import java.util.Comparator;
    import java.util.List;

public class StreamsTest06 {
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
            System.out.println(list.stream().anyMatch(streamer -> streamer.getViwers() > 15000));
            System.out.println(list.stream().allMatch(streamer -> streamer.getViwers() > 100));
            System.out.println(list.stream().noneMatch(streamer -> streamer.getViwers() < 100));

            System.out.println(list.stream().filter(st -> st.getViwers() > 3000).findAny());
            System.out.println(list.stream().filter(st -> st.getViwers() < 3000).findFirst());
            System.out.println(list.stream()
                    .filter(st -> st.getViwers() < 3000)
                    .sorted(Comparator.comparing(Streamer::getName).reversed())
                    .findFirst()
            );
            System.out.println(list.stream()
                    .filter(streamer -> streamer.getViwers() < 3000)
                    .max(Comparator.comparing(Streamer::getName))
            );
        }
    }