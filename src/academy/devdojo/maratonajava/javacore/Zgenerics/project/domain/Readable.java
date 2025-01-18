package academy.devdojo.maratonajava.javacore.Zgenerics.project.domain;

import java.util.concurrent.ThreadLocalRandom;

public class Readable implements Comparable<Readable> {
    private Long isbn;
    private String name;
    private Integer amount;

    public Readable(String name, Integer amount) {
        this.isbn = ThreadLocalRandom.current().nextLong(0, 100000);
        this.name = name;

        this.amount = amount;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Readable{" +
                "isbn=" + isbn +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int compareTo(Readable o) {
        return o.name.compareTo(this.name);
    }
}
