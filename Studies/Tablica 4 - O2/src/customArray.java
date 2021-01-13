public class customArray {
    int[] numbers;

    public customArray(int[] numbers) {
        this.numbers = numbers;
    }

    public int sum() {
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }

        return sum;
    }

    public int max() {
        int k = customArray.this.indexOfMax();
        return numbers[k];
    }

    public int indexOfMax() {
        int max = 0;
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                k = i;
            }
        }

        return k;
    }

    public String doesExists(int number, int n) {
        for (int i = 0; i < n; i++) {
            if (numbers[i] == number) {
                return "Chosen number " + number + " exists within first " + n + " numbers of Array";
            }
        }

        return "Chosen number " + number + " does not exist within first " + n + " numbers of Array";
    }

    public boolean isMultivalent() {
        for (int i = 0; i < numbers.length; i++) {
            for (int k = 0; k < numbers.length; k++) {
                if (i == k) {
                    return false;
                }
            }
        }

        return true;
    }

    public void deleteFromArray(int n) {
        int[] tempArray = new int[numbers.length];


        int i;
        for (i = 0; i < numbers.length; i++) {
            int k;
            if (numbers[i] == n) {

                for (k = 0; k < i; k++) {
                    tempArray[k] = numbers[k];
                }


            }
            i = k + 1;
        }

        for (int j = 0; j < tempArray.length; j++) {
            System.out.println(tempArray[j]);
        }
    }


    public String toString() {
        String s = "[";
        for (int i = 0; i < numbers.length - 1; i++) {
            s += numbers[i] + ", ";
        }
        s += numbers[numbers.length - 1] + "]";

        return s;
    }
}
