package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Powerof4Test {
    Powerof4 powerobject;
    int num;

    @Before
    public void setUp() throws Exception {
        powerobject=new Powerof4();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test

        public void testEmptyPower() throws Exception {

            boolean expectedValue = true;
            int actualValue = powerobject.getDisplay(16);
        assertNotEquals(expectedValue,actualValue);
        }

        @Test

        public void testinvalidPower() throws Exception{
            boolean expectedValue=true;
            int actualValue=powerobject.getDisplay(44);
            assertNotEquals(expectedValue,actualValue);
    }
}