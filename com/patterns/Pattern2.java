package com.patterns;

public class Pattern2 {
    public static void main(String[] args) {
    /*
        * * * *
        * * *
        * *
        *
      */
// Print the above pattern

        for (int i = 0; i < 4 ; i++){
            for (int j = 3 ; j >= i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
