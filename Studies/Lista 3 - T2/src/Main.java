import java.lang.reflect.Array;

public class Main {

    public static int[][] createCustomMatrix(int m, int max) {
        int[][] matrix = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (max * Math.random());
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
	// write your code here


        int[][] matrix1 = createCustomMatrix(3, 10);
        int[][] matrix2 = createCustomMatrix(3, 10);
        int[][] matrix3 = new int[3][3];

        customMatrix customMatrix1 = new customMatrix(matrix1);
//        System.out.println(customMatrix1.sum());
        System.out.println(customMatrix1.toString());
        customMatrix customMatrix2 = new customMatrix(matrix2);

        customMatrix customMatrix3 = customMatrix1.times(matrix2);
    }
}
