package com.example.mipt02;

import org.junit.Test;

import static org.junit.Assert.*;

import utilities.TextCounter;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testCharacterCount() {
        final String givenString = "Hello, test!";
        final String expectedResult = "12";

        final String actualResult = TextCounter.getCharacterCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCharacterCountGivenEmpty() {
        final String givenString = "";
        final String expectedResult = "0";

        final String actualResult = TextCounter.getCharacterCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testWordCount() {
        final String givenString = "Hello, test!";
        final String expectedResult = "2";

        final String actualResult = TextCounter.getWordCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testWordCountGivenWhitespace() {
        final String givenString = "Hello, test          !";
        final String expectedResult = "2";

        final String actualResult = TextCounter.getWordCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testWordCountGivenGarbage() {
        final String givenString = "Hello, test  <>; ! ,;l4895623 hello";
        final String expectedResult = "4";

        final String actualResult = TextCounter.getWordCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testWordCountGivenEmpty() {
        final String givenString = "";
        final String expectedResult = "0";

        final String actualResult = TextCounter.getCharacterCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

}