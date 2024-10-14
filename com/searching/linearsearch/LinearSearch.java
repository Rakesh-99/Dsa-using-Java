package com.searching.linearsearch;

public class LinearSearch {
    public static void main(String[] args){

        // Return the index if the item is found
        // if item is not found return -1;

        int [] arr = {10, 21, 1, 3, 99, 34, 56};
        int target = 99;

        int res = linearSearchFunc(arr, target);
        System.out.println(res);
    }

    public static int linearSearchFunc(int[] arr, int target){

        if (arr.length == 0){
            return  -1;
        }

        for (int i = 0; i < arr.length; i++){

            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}