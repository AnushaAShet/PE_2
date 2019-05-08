package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenTest {
    private Even number;

    @Before
    public void setUp() throws Exception {
        number = new Even();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void givenEvenPositiveNumberShouldReturnTrue() {
        boolean actualValue = number.isEven(6);
        assertTrue(actualValue);
    }

    @Test
    public void givenOddPositiveNumberShouldReturnFalse() {
        boolean actualValue = number.isEven(7);
        assertFalse(actualValue);
    }

}