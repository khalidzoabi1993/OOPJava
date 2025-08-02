public class LearnIntArraysMethods {
    public static void main(String[] args) {
        // Define array of integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Print the array
        printArray(numbers);
        // Calculate the sum of the array
        int sum = sumArray(numbers);
        System.out.println("Sum of array: " + sum);
        // Calculate the average of the array
        double average = averageArray(numbers);
        System.out.println("Average of array: " + average);
        // Find the maximum value in the array
        int max = maxInArray(numbers);
        System.out.println("Max in array: " + max);
        // Find the minimum value in the array
        int min = minInArray(numbers);
        System.out.println("Min in array: " + min);
        // Reverse the array
        int[] reversed = reverseArray(numbers);
        System.out.print("Reversed array: ");
        printArray(reversed);
        // Check if the array contains a specific value
        int valueToCheck = 5;
        boolean containsValue = contains(numbers, valueToCheck);
        System.out.println("Array contains " + valueToCheck + ": " + containsValue);

    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static double averageArray(int[] arr) {
        if (arr.length == 0) return 0;
        return (double) sumArray(arr) / arr.length;
    }
    public static int maxInArray(int[] arr) {
        if (arr.length == 0) return Integer.MIN_VALUE;
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static int minInArray(int[] arr) {
        if (arr.length == 0) return Integer.MAX_VALUE;
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
    public static boolean contains(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }


}
