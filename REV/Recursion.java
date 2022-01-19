package com.souvik.REV;

public class Recursion {
    public static void main(String[] args) {

        /*int sum = printsum(5);
        System.out.println(sum);*/

        /*int factorial = fact(5);
        System.out.println(factorial);*/

        int fibonacci = fibo(5);
        System.out.println(fibonacci);
    }
    static int fibo(int n){
        if(n == 0){
            return n;
        }
        if(n == 1){
            return n;
        }
        return fibo(n-1 ) + fibo( n- 2);
    }
    static int fact(int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
    static int  printsum(int n){
        if(n == 1){
            return 1;


        }
        else {
            return n+printsum(n-1);
        }
    }
}
