package com.souvik.REV;

import java.util.Arrays;

public class BS_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},
                {12,25,35,50},
                {28,29,37,60},
                {33,34,38,70}};
        int target = 37;
        int[] pos = BinarySearch(arr, target);
        System.out.println(Arrays.toString(pos));
    }
    public static int[] BinarySearch(int[][] arr, int target){
        int r = 0;
        int c = arr.length - 1;

        while(r < arr.length && c >=0){
            if(arr[r][c] == target){
               return new int[] {r ,c};
            }
            if(arr[r][c] < target){
                r=r+1;
            }
            else{
                c = c - 1;
            }
        }
        return new int[] {-1,-1};
    }
}
