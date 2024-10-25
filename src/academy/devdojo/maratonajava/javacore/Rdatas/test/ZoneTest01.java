package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        // Obtendo as chaves e valores das zonas:
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);

        // Obtendo a zona do sistema local:
        System.out.println(ZoneId.systemDefault());

        // Obtendo uma zona manualmente com ZoneId.of():
        ZoneId zoneOfSydney = ZoneId.of("Australia/Sydney");
        System.out.println(zoneOfSydney);

        // Obtendo a data e hora local:
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // Adicionando uma zona diferente para a data e hora local:
        ZonedDateTime nowOfZoneSydney = now.atZone(zoneOfSydney);
        System.out.println(nowOfZoneSydney);

        // Obtendo o instante atual (ZuluTime):
        Instant nowInstante = Instant.now();
        System.out.println(nowInstante);

        // Adicionando uma zona diferente para o instante atual (ZuluTime) com acrescimo de tempo da zona:
        ZonedDateTime nowInstanteOfZoneSydney = nowInstante.atZone(zoneOfSydney);
        System.out.println(nowInstanteOfZoneSydney);

        // Quantidade mínima e máxima de offset que se pode adicionar manualmente a uma zona:
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        // Manipulando datas com offset:
        ZoneOffset offSetHaiti = ZoneOffset.of("-05:00");
        System.out.println(offSetHaiti);
        OffsetDateTime offsetDateTime = now.atOffset(offSetHaiti);
        System.out.println(offsetDateTime);
        OffsetDateTime offsetInstante = nowInstante.atOffset(offSetHaiti);
        System.out.println(offsetInstante);
        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, offSetHaiti);
        System.out.println(offsetDateTime1);

        // Datas japonesas:
        JapaneseDate nowJapaniseDate = JapaneseDate.from(now);
        System.out.println(nowJapaniseDate);
    }
}
