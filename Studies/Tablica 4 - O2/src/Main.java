public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = (int) (100* Math.random());
        }

        int[] numbers2 = new int[10];
        for (int j = 0; j < 10; j++) {
            numbers2[j] = j;
        }

        int[] numbers3 = new int[10];
        numbers3[0] = 1;
        numbers3[1] = 2;
        numbers3[2] = 3;
        numbers3[3] = 1;
        numbers3[4] = 2;
        numbers3[5] = 3;
        numbers3[6] = 1;
        numbers3[7] = 2;
        numbers3[8] = 3;
        numbers3[9] = 4;

        customArray tabl = new customArray(numbers);
//        customArray tabl2 = new customArray(numbers2);
        customArray tabl3 = new customArray(numbers3);
//        System.out.println(tabl);
//        System.out.println(tabl2);
        System.out.println(tabl3);
//        System.out.println("The sum: " + tabl.sum());
//        System.out.println("Maximum number: " + tabl.max());
//        System.out.println("Index corresponing to maximum number: " + tabl.indexOfMax());
//        System.out.println(tabl.doesExists(10, 20));
//        if (tabl.isMultivalent()) {
//            System.out.println("The array is multivalent.");
//        } else {
//            System.out.println("The array is not multivalent.");
//        }

//        tabl2.deleteFromArray(3);
        tabl3.deleteFromArray(3);

    }
}
