package academy.devdojo.maratonajava.introducao;
/**idade < 15 == <b>categoria infantil</b> <br>
 *idade > 15 && idade < 18 == <b>categoria juvenil</b> <br>
 *idade >= 18 == <b>categoria adulto</b> <br>
 **/
public class Aula04Condicionais02 {
    public static void main(String[] args) {
        int idade = 17;
        String categoria;

        if (idade < 15){
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18){
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulto";
        }

        System.out.println(categoria);
    }
}
