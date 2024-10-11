package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissão no banco de dados...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize");
    }
}
