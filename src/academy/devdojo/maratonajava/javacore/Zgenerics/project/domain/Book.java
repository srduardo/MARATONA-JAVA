package academy.devdojo.maratonajava.javacore.Zgenerics.project.domain;

import java.util.concurrent.ThreadLocalRandom;

public class Book extends Readable{
    private String author;

    public Book(String name, String author, Integer amount) {
        super(name, amount);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
