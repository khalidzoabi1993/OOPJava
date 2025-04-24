public class page20 {

    // main
    public static void main(String[] args) {
        // page 20
        // Q1
//        int[] numbers = new int[100];
//        int sum = 0;
//        for (int i = 0; i < 100; i++) {
//            numbers[i] = (int) (Math.random() * 101);
//            sum += numbers[i];
//        }
//        double average = (double) sum / 100;
//        System.out.println("Average: " + average);
//        System.out.println("Numbers greater than average:");
//        for (int i = 0; i < 100; i++) {
//            if (numbers[i] > average) {
//                System.out.print(numbers[i] + " ");
//            }
//        }
//        System.out.println();

        // Q2
        int[] original = {5, 8, 3, 12, 7, 9, 4, 11, 6, 2};

        int a = 2;
        int b = 6;

        int size = b - a + 1;
        int[] copy = new int[size];

        int index = 0;
        for (int i = a; i <= b; i++) {
            copy[index] = original[i];
            index++;
        }

        System.out.println("Copied values:");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
        System.out.println();


        // Q3
//        int[] array = { 5, 3, 9, 1, 15 };
//        int max = array[0];
//
//        System.out.println("Numbers satisfying the condition:");
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] >= max) {
//                System.out.print(array[i] + " ");
//                max = array[i];
//            }
//        }
//
//        System.out.println();

        // Q4
//        int[] array = { 5, 3, 9, 1, 15 };
//        int max = array[0];
//
//        System.out.println("Numbers satisfying the condition:");
//        for (int i = 0; i < array.length; i++) {
//            if (i > 1) {
//                if (array[i] >= max && array[i] % array[i - 1] == 0) {
//                    System.out.print(array[i] + " ");
//                    max = array[i];
//                }
//            }
//        }
    }
}
