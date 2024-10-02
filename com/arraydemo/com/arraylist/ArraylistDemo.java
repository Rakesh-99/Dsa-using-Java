package com.arraydemo.com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;


public class ArraylistDemo{

    public static void main(String[] args){

 //     Initializing an array list of Integer :
        ArrayList<Integer> list =  new ArrayList<Integer>(5);

        //adding elements to arraylist :
        list.add(11);
        list.add(9);
        list.add(20);
        list.add(12);
        list.add(19);


        // print arraylist using for loop :

        for (int i = 0 ; i < 5 ; i++){
            System.out.println("The elements are : "  +  list.get(i)); // List[index] will not work here!
        }


        System.out.println(list);  // Printing list before removing

        //removing index of 0 :

        list.remove(0);
        System.out.println(list);   // Printing list after removing

        // set another value in specified index :

        list.set(1, 11);

        System.out.println(list);


        // check if the list contains the specified element or not :

        System.out.println(list.contains(90));   // output- false, cause list doe not contain 90.


    }
}