package arraydemo;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int [][] arr = new int[3][4];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter inputs");

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                arr[i][j] = input.nextInt();
            }
        }

        for(int i = 0 ; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
