package academy.devdojo.maratonajava.javacore.ZZAinnerClasses.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Member {
    private Integer id;
    private String name;
    private List<Library.Book> rentedBooks;

    public Member(String name) {
        this.id = ThreadLocalRandom.current().nextInt(0, 10000);
        this.name = name;
        this.rentedBooks = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Library.Book> getRentedBooks() {
        return rentedBooks;
    }

    public void setRentedBooks(List<Library.Book> rentedBooks) {
        this.rentedBooks = rentedBooks;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rentedBooks=" + rentedBooks +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Member member = (Member) object;
        return Objects.equals(id, member.id) && Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
