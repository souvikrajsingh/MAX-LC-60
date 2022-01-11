package com.souvik.REV;

import java.util.Scanner;

public class BS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the search element");
        int target = sc.nextInt();
        /*int pos = binarysearch(arr, target, 0, arr.length - 1);
        if (pos == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element present at : " + (pos + 1));
        }*/
        int pos = orderagnosticBS(arr, target, 0, arr.length - 1);
        if (pos == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element present at : " + (pos + 1));
        }
    }
    static int binarysearch(int[] arr, int target , int start, int end){
        int mid = start + (end - start) / 2;
        if(start > end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return binarysearch(arr , target , start, mid - 1);
        }
        return binarysearch(arr, target, mid + 1 ,end);
    }

    static int orderagnosticBS(int[] arr , int target , int start, int end){
        int mid = start + (end - start) / 2;
        if(start > end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        if(arr[0] < arr[arr.length - 1]){
            if(arr[mid] > target){
                return binarysearch(arr , target , start, mid - 1);
            }
            return binarysearch(arr, target, mid + 1 ,end);
        }
        else {
            if (arr[mid] > target) {
                return binarysearch(arr, target, mid + 1, end);
            }
            return binarysearch(arr, target, start, mid - 1);
        }
    }
}
