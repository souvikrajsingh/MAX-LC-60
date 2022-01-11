package com.souvik.REV;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        optimisedbubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void  optimisedbubblesort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i ; j++) {
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[ j- 1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                    break;
                }
            }
        }
    }

