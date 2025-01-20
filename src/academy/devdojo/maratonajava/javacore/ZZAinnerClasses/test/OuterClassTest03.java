package academy.devdojo.maratonajava.javacore.ZZAinnerClasses.test;

public class OuterClassTest03 {
    private String name = "Eduardo";

    static class Nested {
        private String lastname = "Rodrigues";

        public void print() {
            System.out.println(new OuterClassTest03().name + " " + lastname);
        }

    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();

    }

}
