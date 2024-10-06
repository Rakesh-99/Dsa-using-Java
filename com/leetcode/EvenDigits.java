package com.leetcode;


//Leetcode question link -  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

//1295. Find Numbers with Even Number of Digits


//Given an array nums of integers, return how many of them contain an even number of digits.

//Example 1:

//Input: nums = [12,345,2,6,7896]
//Output: 2

//Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).

//Therefore only 12 and 7896 contain an even number of digits.



public class EvenDigits {

    int count;

    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896, 212121, 121};

        int res = getEvenDigits(nums);
        System.out.println(res);
    }

    public static int getEvenDigits(int[] nums){

        EvenDigits obj = new EvenDigits();
        obj.count = 0;

        for (int num : nums) {
            checkEven(num , obj);
        }
        return obj.count;
    }

    public static void checkEven(int num, EvenDigits obj) {
        String str = num + "";
        if (str.length() % 2 == 0){
            obj.count ++;
        }
    }
}