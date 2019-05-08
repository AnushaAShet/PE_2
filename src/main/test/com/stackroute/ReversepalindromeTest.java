package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversepalindromeTest {


    private Reversepalindrome palindrome;
    private String s;

    @Before
    public void setUp() throws Exception {


        palindrome = new Reversepalindrome();

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void emptyStringTest() throws Exception {

        Boolean expectedValue = true;

        Boolean actualValue = palindrome.checkPalindrome("");
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void multipleWhiteSpaceTest() throws Exception {
       // Boolean expectedValue = true;

        Boolean actualValue = palindrome.checkPalindrome("malayalam");
        //assertEquals(expectedValue, actualValue);
        assertTrue(actualValue);


    }


}
