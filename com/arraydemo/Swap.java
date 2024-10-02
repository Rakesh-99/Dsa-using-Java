package com.arraydemo;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args){

        int [] arr = {10, 20 ,9 , 2, 1};

        System.out.println("Before swapping : " + Arrays.toString(arr));
        swapElements(arr, 1, 4);
        System.out.println("After swapping : " + Arrays.toString(arr));

    }
    public static void swapElements (int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
     }
}
