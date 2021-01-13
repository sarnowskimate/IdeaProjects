public class customMatrix {
    int[][] matrix;

    public customMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int sum() {
        int sum = 0;
        int m = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    public int[][] times(int[][] matrix) {
        int m = this.matrix.length;
        int[][] newMatrix = new int[m][m];
        for (int k = 0; k < m; k++) {
            for (int j = 0; j < m; j++) {
                for (int i = 0; i < m; i++) {
                    matrix[k][j] += this.matrix[k][i] * matrix[i][j];

                }
            }
        }

        return newMatrix;
    }

    public String toString() {
        int m = matrix.length;
        String matrixToString = "";
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                matrixToString += matrix[i][j] + " ";
            }
            matrixToString += "\n";
        }
        return matrixToString;
    }
}
