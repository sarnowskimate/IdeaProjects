public class Matrix2 {
    Index index;
    Index[][] indexes;


    public Matrix2(Index[][] indexes) {
        this.indexes = indexes;
    }

    public int maxValue() {
        Index index = this.indexOfMaxValue();
        int max = table[index.i][index.j];

        return max;
    }

    private Index indexOfMaxValue() {
        int max = indexes[0][0];
        Index index = new Index(0, 0);
        for (int i = 0; i < table.length; i++) {
            for (int j = 1; j < table.length; j++) {
                if (table[i][j] > max) {
                    index.i = i;
                    index.j = j;
                }
            }
        }

        return index;
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                sum += table[i][j];
            }
        }

        return sum;
    }


}
