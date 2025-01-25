package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.project.domain;

import java.util.concurrent.ThreadLocalRandom;

public class Product {
    private Long code;
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.code = ThreadLocalRandom.current().nextLong(0, 100000);
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
