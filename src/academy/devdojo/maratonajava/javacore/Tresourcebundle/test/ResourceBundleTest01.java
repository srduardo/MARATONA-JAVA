package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;
/** Resource Bundle é útil para armazenar diferentes valores em uma mesma chave,
* em diferentes arquivos. Pode ser usando para internacionalizar um sistema, apenas mundando
* os parâmetros de língua e país da classe Resource Bundle.*/
public class ResourceBundleTest01 {
    public static void main(String[] args) {
        // Língua e país local:
        System.out.println(Locale.getDefault());


        System.out.println();
        ResourceBundle bundlePtBR = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundlePtBR.getString("hello.world"));
        System.out.println(bundlePtBR.getString("good.morning"));
        System.out.println(bundlePtBR.getString("hi"));

        System.out.println();
        ResourceBundle bundleEnUS = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundleEnUS.getString("hello.world"));
        System.out.println(bundleEnUS.getString("good.morning"));

    }
}
