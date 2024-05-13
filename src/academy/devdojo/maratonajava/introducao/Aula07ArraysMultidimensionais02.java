package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3, 4, 5, 6};
        arrayInt[2] = array;

        for (int[] arr : arrayInt) {
            System.out.println("\n-------");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arr : arrayInt2) {
            System.out.println("\n-------");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}
