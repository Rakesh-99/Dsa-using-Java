package arraydemo;

import java.util.Scanner;

public class OneDimensionalArray {

    public static void main(String[] args){


        // 1D array - Take an array input from user and print it  :
        int [] numsArr = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("enter numbers to fill the array");

        for (int i = 0; i < 5 ; i ++){
            numsArr[i] = input.nextInt();
        };

        for (int values : numsArr){
            System.out.print(values + " ");
        }
        System.out.println();

    }
}
