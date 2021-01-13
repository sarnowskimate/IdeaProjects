public class Main {

    public static int[] createArray(int max, int amount) {
        int[] numbers = new int[amount];
        for (int i = 0; i < amount; i++) {
            numbers[i] = (int) (max * Math.random() + 1);
        }

        return numbers;
    }

    public static void main(String[] args) {
	// write your code here
        CustomArray array = new CustomArray(createArray(10, 10));
        array.displayInOrder();
        array.displayInReversedOrder();
        array.divideIntoEvenAndOdd();

    }
}
