package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataRemover {
    public abstract void remove();

    default void checkPermission() {
        System.out.println("Checando permissão...");
    }
}
