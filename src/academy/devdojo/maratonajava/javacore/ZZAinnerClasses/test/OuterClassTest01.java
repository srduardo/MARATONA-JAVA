package academy.devdojo.maratonajava.javacore.ZZAinnerClasses.test;

public class OuterClassTest01 { // Classe externa
    private String name = "Boruto Uzumaki";

    class Inner { // Classe interna
         public void printOuterClassName() {
            System.out.println(name);
             System.out.println("Classe interna: " + this);
             System.out.println("Classe externa: " + OuterClassTest01.this);
        }

        @Override
        public String toString() {
            return "Inner{}";
        }
    }

    @Override
    public String toString() {
        return "OuterClassTest01{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // 1° forma de instanciar uma classe interna:
        OuterClassTest01 outerClass = new OuterClassTest01();
        Inner innerClass1 = outerClass.new Inner();
        innerClass1.printOuterClassName();

        // 2° forma de instanciar uma classe interna:
        Inner innerClass2 = new OuterClassTest01().new Inner();
        innerClass2.printOuterClassName();

        // 3° forma de instanciar uma classe interna:
        OuterClassTest01.Inner innerClass3 = new OuterClassTest01().new Inner();
        innerClass3.printOuterClassName();
    }
}
