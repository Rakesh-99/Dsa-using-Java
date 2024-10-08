package com.leetcode.array;
import java.util.Arrays;




//Question link - https://leetcode.com/problems/remove-duplicates-from-sorted-array/description


//Question - Remove Duplicates from Sorted Array

//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

//Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

//Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
//Return k.


//Example :

//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).




public class RemoveDuplicates {

    public static void main(String[] args) {

        int [] arr = {1, 1, 2, 4, 5, 6, 6, 7};


        int res = removeDuplicateElements(arr);
        System.out.println("Total unique elements : "+ res);

        for (int i = 0 ; i < res; i++){
            System.out.print(arr[i]);
        }
    }

    public static int removeDuplicateElements(int[] arr){

        int k = 1;

        for (int i = 1; i < arr.length; i++){

            if (arr[i] != arr[i-1]){
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println();
        return k;
    }
}
