package com.arraydemo.com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class TwoDimensionalAL {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter inputs");

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(2);

//        Initializing
        for (int i = 0 ; i < 5; i++){
            list.add(new ArrayList<>());
        }

//        Adding elements from user
        for (int i = 0 ; i < 5; i++){
            list.get(i).add(input.nextInt());
        }

        System.out.println(list);
    }
}

