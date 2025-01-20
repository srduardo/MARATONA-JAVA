package academy.devdojo.maratonajava.javacore.ZZAinnerClasses.test;

class Animal {
    public void walk() {
        System.out.println("Animal walking...");
    }
}

public class AnonymousClassTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Anonymous Class from Animal");
            }
        };

        animal.walk();
    }
}
