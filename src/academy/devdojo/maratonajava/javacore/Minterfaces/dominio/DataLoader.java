package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    void load();

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize");
    }
}
