public class LearnStringArraysMethods {
    public static void main(String[] args) {
        // Example usage of string array methods
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};

        // Print the array
        printArray(words);

        // Find the longest word
        String longest = findLongestWord(words);
        System.out.println("Longest word: " + longest);

        // Find the shortest word
        String shortest = findShortestWord(words);
        System.out.println("Shortest word: " + shortest);

        // Check if a word exists in the array
        String wordToCheck = "banana";
        boolean containsWord = contains(words, wordToCheck);
        System.out.println("Array contains '" + wordToCheck + "': " + containsWord);
    }

    public static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static String findLongestWord(String[] arr) {
        if (arr.length == 0) return "";
        String longest = arr[0];
        for (String str : arr) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }

    public static String findShortestWord(String[] arr) {
        if (arr.length == 0) return "";
        String shortest = arr[0];
        for (String str : arr) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
        return shortest;
    }

    public static boolean contains(String[] arr, String value) {
        for (String str : arr) {
            if (str.equals(value)) {
                return true;
            }
        }
        return false;
    }
}
