package com.arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        int [] nums = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array elements");

        for (int i = 0 ; i < nums.length; i++){
            nums[i] = input.nextInt();
        }

        System.out.println("Before reverse : " + Arrays.toString((nums)));

        reverseElements(nums);

        System.out.println("After reverse : " + Arrays.toString((nums)));

    }
    public static void reverseElements(int[] arr){
        int startIndex = 0;
        int lastIndex = arr.length -1;

        while (startIndex < lastIndex){
            int temp = arr[startIndex];
            arr[startIndex] = arr[lastIndex];
            arr[lastIndex] = temp;

            startIndex ++;
            lastIndex --;
        }
    }
}