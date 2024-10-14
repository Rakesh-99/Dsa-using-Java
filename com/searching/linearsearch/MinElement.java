package com.searching.linearsearch;

public class MinElement {
    public static void main (String[] args){

        int[] arr = { 87, 22, 89, 70, 1, 0, -5};

        int res  = findMinValue(arr);
        System.out.println(res);
    }

    public static int findMinValue(int[] arr){

        int min_value = arr[0];

        for (int i = 1 ; i < arr.length ; i++) {
            if (min_value > arr[i]){
                min_value = arr[i];
            }
        }
            return  min_value;
    }

}
