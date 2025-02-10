package academy.devdojo.maratonajava.javacore.ZZEstreams.domain;

import java.util.Objects;

public class Streamer {

    private String name;
    private Integer viwers;

    public Streamer(String name, Integer viwers) {
        this.name = name;
        this.viwers = viwers;
    }

    @Override
    public String toString() {
        return "Streamer{" +
                "name='" + name + '\'' +
                ", viwers=" + viwers +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Streamer streamer = (Streamer) object;
        return Objects.equals(name, streamer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String getName() {
        return name;
    }

    public Integer getViwers() {
        return viwers;
    }
}
