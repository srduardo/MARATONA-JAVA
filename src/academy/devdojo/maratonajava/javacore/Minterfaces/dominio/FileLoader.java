package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void loader() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões no arquivo");
    }
}
