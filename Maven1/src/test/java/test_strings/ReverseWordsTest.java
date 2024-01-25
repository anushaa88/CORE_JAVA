package test_strings;

import org.junit.Test;
import strings.ReverseWords;

import static org.junit.Assert.assertEquals;

public class ReverseWordsTest {

    @Test
    public void testReverseWords() {
        String inputSentence = "Hello World";
        String expectedReversedSentence = "olleH dlroW";

        String actualReversedSentence = ReverseWords.reverseWords(inputSentence);

        assertEquals(expectedReversedSentence, actualReversedSentence);
    }


}
