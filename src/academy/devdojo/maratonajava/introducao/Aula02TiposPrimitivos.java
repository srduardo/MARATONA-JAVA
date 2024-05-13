package academy.devdojo.maratonajava.introducao;

/**
 * <b>byte</b> = 1 bytes (-128 a 127) <br>
 * <b>short</b> = 2 bytes (-32768 a 32767) <br>
 * <b>int</b> = 4 bytes (-2,147,483,648 a 2,147,483,647) <br>
 * <b>long</b> = 8 bytes (-9,223,372,036,854,775,808 a 9,223,372,036,854,750000) <br>
 * <b>float</b> = 4 bytes (3.4e-038 a 3.4e+038) <br>
 * <b>double</b> = 8 bytes (1.7e-308 a 1.7e+038) <br>
 * <b>boolean</b> = 1 bit (true a false) <br>
 * <b>char</b> = 2 bytes ( )
 */

public class Aula02TiposPrimitivos {
    public static void main (String[] args){
        int idade = (int) 100000000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;
        String nome = "Eduardo";

        System.out.println("Idade: "+idade);
        System.out.println("Número: "+numeroGrande);
        System.out.println("Salário: "+salarioDouble);
        System.out.println("Salário: "+salarioFloat);
        System.out.println("Idade: "+idadeByte);
        System.out.println("Idade: "+idadeShort);
        System.out.println("Valor: "+verdadeiro);
        System.out.println("Valor: "+falso);
        System.out.println("Caractere: "+caractere);
        System.out.println("Oi meu nome é "+nome);
    }
}
