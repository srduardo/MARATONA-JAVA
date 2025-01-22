package academy.devdojo.maratonajava.javacore.ZZAinnerClasses.project;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Library {
    private Set<Book> avalibleBooks;
    private Set<Book> unavalibleBooks;
    private Set<Member> members;
    private History history;

    public Library() {
        this.avalibleBooks = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        this.unavalibleBooks = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        this.members = new TreeSet<>(new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        this.history = new History();
    }

    public static class Book {
        private Long isbn;
        private String name;
        private Integer amount;
        private String author;

        public Book(String name, Integer amount, String author) {
            this.isbn = ThreadLocalRandom.current().nextLong(0, 100000);
            this.name = name;
            this.amount = amount;
            this.author = author;
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

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "isbn=" + isbn +
                    ", name='" + name + '\'' +
                    ", amount=" + amount +
                    ", author='" + author + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            Book book = (Book) object;
            return Objects.equals(isbn, book.isbn) && Objects.equals(name, book.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(isbn, name);
        }
    }

    public class History {
        private Map<Integer, List<Book>> history;

        public History() {
            this.history = new HashMap<>();
        }

        public void registerRent(Integer memberId, List<Book> books) {
            history.put(memberId, books);
            System.out.println("Rent stored");
        }
    }

    public void registerMember(Member member) {
        if (member != null) {
            members.add(member);
            System.out.println("New member registered!");
        } else {
            System.out.println("Member not found...");
        }
    }

    public void registerBook(Book... books) {
        for (Book book : books) {
            if (book != null && book.getAmount() > 0) {
                avalibleBooks.add(book);
                System.out.println("New book registered!");
            }
        }
    }

    public void rentReport(String membersName, List<Book> booksNames) {
        class Report {
            String memberName;
            List<Book> booksNames;
            LocalDate rentsDate;
            LocalDate refoundsDate;

            public Report(String memberName, List<Book> booksNames) {
                this.memberName = memberName;
                this.booksNames = booksNames;
                this.rentsDate = LocalDate.now();
                this.refoundsDate = rentsDate.plus(1, ChronoUnit.WEEKS);
                rentReport();
            }

            public void rentReport() {
                System.out.println();
                System.out.println("--- RENT REPORT ---");
                System.out.println("-> Member's name: " + this.memberName);
                System.out.println("-> Books' name: ");
                for (Book bookName : booksNames) {
                    System.out.println("- " + bookName.getName());
                }
                System.out.println("-> Rent's Date: " + rentsDate);
                System.out.println("-> Refound's Date: " + refoundsDate);
                System.out.println();
            }
        }

        new Report(membersName, booksNames);
    }

    public void rentBook(Member member, Book... books) {
        List<Book> bookList = new ArrayList<>();

        for (Book book : books) {
            if (member != null && book != null) {
                member.getRentedBooks().add(book);
                book.setAmount(book.getAmount() - 1);
                bookList.add(book);

                if (book.getAmount() <= 0) {
                    this.unavalibleBooks.add(book);
                    this.avalibleBooks.remove(book);
                    System.out.println("!! - " + book.getName() + " is out of stock!");
                }

                System.out.println(book.getName() + " was rented by " + member.getName() + "!");
            }
            if (member == null) {
                System.out.println("Member not found...");
            }
            if (book == null) {
                System.out.println("Book not found...");
            }
        }

        rentReport(member.getName(), bookList);
        history.registerRent(member.getId(), bookList);
    }

    public void refoundBook(Member member, Book... books) {
        for (Book book : books) {
            if (member != null && book != null) {
                member.getRentedBooks().remove(book);
                book.setAmount(book.getAmount() + 1);

                if (book.getAmount() > 0) {
                    this.unavalibleBooks.remove(book);
                    this.avalibleBooks.add(book);
                    System.out.println("!! - " + book.getName() + " is in of stock!");
                }

                System.out.println(book.getName() + " was refounded by " + member.getName() + "!");
            }
            if (member == null) {
                System.out.println("Member not found...");
            }
            if (book == null) {
                System.out.println("Book not found...");
            }
        }
    }

    public Set<Book> getAvalibleBooks() {
        return avalibleBooks;
    }

    public void setAvalibleBooks(Set<Book> avalibleBooks) {
        this.avalibleBooks = avalibleBooks;
    }

    public Set<Book> getUnavalibleBooks() {
        return unavalibleBooks;
    }

    public void setUnavalibleBooks(Set<Book> unavalibleBooks) {
        this.unavalibleBooks = unavalibleBooks;
    }

    public Set<Member> getMembers() {
        return members;
    }

    public void setMembers(Set<Member> members) {
        this.members = members;
    }

    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("Caixa de pássaros", 1, "William James");
        Member member = new Member("Eduardo");

        library.registerMember(member);
        library.registerBook(book);
        library.rentBook(member, book);
        library.refoundBook(member, book);

    }
}
