package academy.devdojo.maratonajava.javacore.ZZAinnerClasses.test;

public class OuterClassTest02 { // Classe externa
    private String name = "Tobirama";

    public void print(final String param) { // Método da classe externa
        final String lastname = "Senju"; // Atributos no método da classe externa devem ser final ou efetivamente final, caso usados na classe local

        class LocalClass { // Classe local do método da classe externa

            public void printInnerClass() { // Método da classe local do método da classe externa

                System.out.println(name + " " + lastname);
                System.out.println(param);

            }

        }

        LocalClass localClass = new LocalClass(); // A classe local deve ser instanciada dentro do método para ser usada
        localClass.printInnerClass();


    }

    public static void main(String[] args) {
        OuterClassTest02 outerClassTest02 = new OuterClassTest02();
        outerClassTest02.print("2° Hokage");
    }
}
