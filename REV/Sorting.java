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

        OptimisedSelectionSort(arr);
        System.out.println(Arrays.toString(arr));
        /*optimisedbubblesort(arr);
        System.out.println(Arrays.toString(arr));*/

        /*optimisedbubblesort(arr);
        System.out.println(Arrays.toString(arr));*/

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

        public static void OptimisedInsertionsort(int[] arr) {
            for (int i = 0; i <= arr.length - 2; i++) {
                for (int j = i + 1; j > 0; j--) {
                    if (arr[j] < arr[j - 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    } else {
                        break;
                    }
                }
            }
        }

        public static void OptimisedSelectionSort(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                int last = arr.length- i - 1;
                int maxIndex = GetMax(arr, 0 , last);
                swap(arr, maxIndex, last);
            }
        }
        public static int GetMax(int[] arr, int start, int end){
            int max = 0;
            for (int i = 1; i < end; i++)
            {
                if(arr[i] > arr[max]){
                    max = i;
                }
            }
            return max;
        }
        public static void swap(int [] arr, int a, int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }

