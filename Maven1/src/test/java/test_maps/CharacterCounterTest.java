package test_maps;


import maps.CharacterCounter;

public class CharacterCounterTest {
    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
                "test string",
                "Hello, World!",
                "abracadabra",
                "122333444455555"
                // Add more test cases as needed
        };

        for (String testCase : testCases) {
            System.out.println("Input String: " + testCase);
            System.out.print("Expected Output: ");
            printExpectedOutput(testCase);
            System.out.println();
            System.out.print("Actual Output: ");
            CharacterCounter.printCharacterCounts(testCase);
            System.out.println("\n");
        }
    }

    private static void printExpectedOutput(String inputString) {
        StringBuilder output = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (!output.toString().contains(c + "")) {
                int count = countOccurrences(inputString, c);
                output.append(c).append("-").append(count).append(", ");
            }
        }
        System.out.print(output);
    }

    private static int countOccurrences(String inputString, char c) {
        int count = 0;
        for (char ch : inputString.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }
}
