package com.rcf.guide.hello;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * A 'Unit Test' is a function that runs when a program is being built to make
 * sure
 * 
 * @author Ryan Fleck
 * @since 0.1.0
 * @see App
 */
public class AppTest {

    /**
     * At least once unit test should exist for each method.
     */
    @Test
    public void testAdd() {
	assertEquals(2, App.add(1, 1));
	assertEquals(1, App.add(3, -2));
	assertEquals(14, App.add(9, 5));
    }

}
