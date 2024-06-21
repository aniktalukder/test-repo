package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args ) {

        int[] intArray = {9, 7, 7, 5, 10, 20, 9, 7, 45, 20, 9, 10};


    }

    public static int frequencyCounter(int element, int[] inputArray) {
        int counter = 0;
        for (int elt : inputArray) {
            if (element == elt) {
                counter += 1;
            }
        }
        return counter;
    }

    public static int[] frequencyCounter2(int noOfTimes, int[] inputArray) {


    }
}