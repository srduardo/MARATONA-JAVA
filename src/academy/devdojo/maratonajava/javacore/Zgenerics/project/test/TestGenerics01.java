package academy.devdojo.maratonajava.javacore.Zgenerics.project.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.project.domain.Book;
import academy.devdojo.maratonajava.javacore.Zgenerics.project.domain.Library;
import academy.devdojo.maratonajava.javacore.Zgenerics.project.domain.User;

public class TestGenerics01 {
    public static void main(String[] args) {
        Library<Book> library = new Library<>();
        Book book1 = new Book("Garotos Corvos", "Eduardo", 8);
        Book book2 = new Book("Senhor dos Aneis", "Augusto", 5);

        library.registerNewObject(book1);
        library.registerNewObject(book2);

        library.objectsListing();

        User user = new User("Golias", 15);

        library.registerNewUser(user);

        library.rentObject(user, book2);

        library.refoundObject(user, book2);
    }
}
