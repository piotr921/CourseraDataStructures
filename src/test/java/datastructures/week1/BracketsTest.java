package datastructures.week1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BracketsTest {

    @DataProvider
    private Object[][] textProvider() {
            return new Object[][]{
                    {"[]", "Success"},
                    {"{}[]", "Success"},
                    {"[()]", "Success"},
                    {"(())", "Success"},
                    {"{[]}()", "Success"},
                    {"{", "1"},
                    {"{[}", "3"},
                    {"foo(bar)", "Success"},
                    {"foo(bar[i)", "10"},
        };
    }

    @Test(dataProvider = "textProvider")
    public void shouldCheckIfBracketsMatch(String text, String expected) {
        // Given
        Brackets brackets = new Brackets();

        // When
        String result = brackets.isBalanced(text);

        // Then
        assertEquals(result, expected);
    }
}