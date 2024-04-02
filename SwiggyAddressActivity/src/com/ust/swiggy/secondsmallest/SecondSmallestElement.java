package com.ust.swiggy.secondsmallest;

import java.util.Arrays;
/**
 *
 */
public class SecondSmallestElement{
    public static int secondSmallest(int[] input) {
        final String METHOD_NAME = "secondSmallest2";
        System.out.println("Method Invoked:" + METHOD_NAME + ":" + Arrays.toString(input));
        if (input == null) {
            throw new NullPointerException("Array Reference Is Null and Check Once");
        }
        int secondElement = Arrays.stream(input).sorted().distinct().skip(1).findAny().getAsInt();
        System.out.println("Method Response:" + METHOD_NAME + ":" + secondElement);
        return secondElement;

    }
   }