package com.rcf.guide.hello;

/**
 * @author Ryan Fleck
 * @since 0.1.0
 * @see AppTest
 */
public class App {

    /**
     * @param args Additional parameters given from the command line.
     */
    public static void main(String[] args) {
	System.out.println("Hello World! 2 + 2 = " + add(2, 2));
    }

    /**
     * Simple function to add two numbers. This comment is 'JavaDoc' and is
     * processed so, when you hover over the method, it shows this information.
     * 
     * @param x First number to be added.
     * @param y Second number to be added.
     * @return The product of x and y.
     */
    public static int add(int x, int y) {
	return x + y;
    }
}
