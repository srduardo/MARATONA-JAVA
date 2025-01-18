package academy.devdojo.maratonajava.javacore.Zgenerics.project.domain;

import java.util.concurrent.ThreadLocalRandom;

public class Magazine extends Readable{
    private String publisher;

    public Magazine(String name, Integer amount, String publisher) {
        super(name, amount);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
