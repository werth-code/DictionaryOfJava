package com.werth;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        int[] nums2 = {1, 3, 5, 7, 9};
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(sumNumbers(nums));


//        StaticVariablesMethods.addToObjCount(5);
//        System.out.println(StaticVariablesMethods.getObjCount());


    }

    public static int sumNumbers(int[] numbers) { // method body
        int sum = 0; // create a int set = 0

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] >= 2 && numbers[i] <=5) {
                sum = sum + numbers[i];
            }
        }
        return sum;
    }
}
