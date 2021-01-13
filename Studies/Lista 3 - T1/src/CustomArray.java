public class CustomArray {

    int[] numbers;

    public CustomArray(int[] numbers) {
        this.numbers = numbers;
    }

    public void displayInOrder() {
        String s = "[";
        for (int i = 0; i < numbers.length - 1; i++) {
            s += numbers[i] + ", ";
        }

        s += numbers[numbers.length - 1] + "]";
        System.out.println(s);
    }

    public void displayInReversedOrder() {
        String s = "[";
        for (int i = numbers.length - 1; i > 0; i--) {
            s += numbers[i] + ", ";
        }

        s += numbers[0] + "]";
        System.out.println(s);
    }

    public void divideIntoEvenAndOdd() {
        int[] evenArray = new int[numbers.length];
        CustomArray customEvenArray = new CustomArray(evenArray);

        int[] oddArray = new int[numbers.length];
        CustomArray customOddArray = new CustomArray(oddArray);

        for (int i = 0; i < numbers.length; i++) {
            int j = 0;
            int k = 0;
            for (j = 0; j < numbers.length; j++) {
            if (numbers[i] % 2 == 0) {
                customEvenArray.numbers[j++] = numbers[i];
            } else {
                customOddArray.numbers[k++] = numbers[i];
            }

            customEvenArray.displayInOrder();
        }
    }

    public void divideIntoEvenAndOdd2() {
        int[] evenArray = new int[numbers.length];
        int[] oddArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int j = 0;
            int k = 0;
            if (numbers[i] % 2 == 0) {
                evenArray[j] = numbers[i];
                j++;
            } else {
                oddArray[k] = numbers[i];
                k++;
            }
        }

        System.out.println();
    }




}
