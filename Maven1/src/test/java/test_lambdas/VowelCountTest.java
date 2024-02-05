package test_lambdas;

import lambdas.VowelCount;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class VowelCountTest {

    @Test
    public void testVowelCount() {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Execute the main method
        VowelCount.main(new String[]{});

        // Normalize line separators in expected and actual output
        String expectedOutput = "apple - Number of vowels: 2\r\n" +
                "banana - Number of vowels: 3\r\n" +
                "orange - Number of vowels: 3\r\n" +
                "grape - Number of vowels: 2\r\n" +
                "kiwi - Number of vowels: 2\r\n";

        String actualOutput = outContent.toString().replace(System.lineSeparator(), "\r\n");

        // Compare the expected and actual output
        assertEquals(expectedOutput, actualOutput);
    }
}
