package com.searching;

import java.util.Arrays;

public class LinearSearchIn2D{
    public static void main(String[] args){

        // Find the target element in 2D Array
        // If item is not found return -1

        int [][] arr = {
                {11, 31, 44},
                {1, 98},
                {21, 34, 56, 73, 27},
                {99}
        };

        int target = 99;

        int[] res = getTargetElements(arr, target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] getTargetElements(int[][] arr, int target){

        if (arr.length == 0){
            return new int[]{-1 ,-1};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}