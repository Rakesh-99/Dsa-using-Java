package com.arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {


        int [][] arr = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input ");

//        input

        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = input.nextInt();
            }
        }

//        output

//        for (int row = 0 ; row < arr.length; row++){
//            for (int col = 0 ; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        or

        for (int [] rows : arr){
//            for (int values : rows){
//                System.out.print(values + " ");
//            }
//            or
            System.out.println(Arrays.toString(rows));

            System.out.println();
        }
    }
}