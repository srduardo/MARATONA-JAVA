package academy.devdojo.maratonajava.javacore.Zgenerics.project.domain;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class User {
    private Long id;
    private String name;
    private Integer age;
    private Queue<Readable> rentedObjects;

    public User(String name, Integer age) {
        this.id = ThreadLocalRandom.current().nextLong(0, 100000);
        this.name = name;
        this.age = age;
        this.rentedObjects = new PriorityQueue<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Queue<Readable> getRentedObjects() {
        return rentedObjects;
    }

    public void setRentedObjects(Queue<Readable> rentedObjects) {
        this.rentedObjects = rentedObjects;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", rentedObjects=" + rentedObjects +
                '}';
    }
}
