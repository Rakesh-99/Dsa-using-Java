package com.leetcode.array;

public  class EvenDigits {

    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896, 212121, 121};

        int res =  findEvenNum(nums);
        System.out.println(res);
    }

    public static int findEvenNum(int[] nums){
        int count = 0;

        for (int num : nums){
            String str = num + "";

            if (str.length() % 2 == 0){
                count ++ ;
            }
        }
        return count;
    }
}

