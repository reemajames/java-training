package com.ust.swiggy.test;

import com.ust.swiggy.secondsmallest.SecondSmallestElement;
import org.junit.*;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSecondSmallest {
    /**
     *
     */
    private static SecondSmallestElement secondSmallestElement = null;
    /**
     *
     */
    @BeforeClass
    public static void init() {
        System.out.println("init Method");
        secondSmallestElement = new SecondSmallestElement();
    }

    /**
     *
     */
    @AfterClass
    public static void destroy() {
        System.out.println("destroy method");
        secondSmallestElement = null;
    }

    @Test
    public void testSecondSmallest() {
        int[] input = {12, 32, 45, 32, 43, -1, -9};
        try {
            int output = secondSmallestElement.secondSmallest(input);
            Assert.assertEquals(-1, output);
        } catch (NullPointerException e) {
            fail();
        }
    }

    @Test
    public void testSecondSmallest1() {
        int[] input = {};
        try {
            secondSmallestElement.secondSmallest(input);

        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }

    }
}