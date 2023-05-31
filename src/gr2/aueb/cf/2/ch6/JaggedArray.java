package gr2.aueb.cf;

public class JaggedArray {

    public static void main(String[] args) {
        int[][] arr = new int[3][];

        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int[6];

        for (int[] row : arr) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
