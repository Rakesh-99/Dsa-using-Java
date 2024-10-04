package com.searching;

public class MaxElement {
    public static void main(String[] args){


        int [] nums = {12, 3, 21, 42, 76,90, 22};

        System.out.println(findMaxElem(nums));
    }

    public static int findMaxElem(int[] nums) {

        if(nums == null){
            return  -1;
        };

        int findMax = Integer.MIN_VALUE;
//
//        for (int i = 0; i < nums.length; i++){
//            if(findMax < nums[i]){
//                findMax = nums[i];
//            }
//        }
//        or
        for (int num : nums){
            if(findMax < num){
                findMax = num;
            }
        }
        return  findMax;
    }
}