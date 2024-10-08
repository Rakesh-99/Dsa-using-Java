package com.leetcode.array;


//Question - https://leetcode.com/problems/richest-customer-wealth/description

//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the [ith] customer has in the [jth] bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

//        Example :
//
//        Input: accounts = [[1,2,3],[3,2,1]]
//        Output: 6
//        Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//        2nd customer has wealth = 3 + 2 + 1 = 6
//        Both customers are considered the richest with a wealth of 6 each, so return 6.

public class RichestCustomerWealth {
    public static void main (String[] args){

        int[][] arr = {
                {1, 2, 3},
                {3, 2, 1},
                {10,3}
        };

       int res = getPersonMaxWealth(arr);
        System.out.println(res);
    }
    public static int getPersonMaxWealth(int[][] arr){
        int maxWealth = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row ++){
            int sum = 0;

            for (int col = 0; col < arr[row].length; col++){
                 sum += arr[row][col];
            }
            if (sum > maxWealth){
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
