package com.souvik.REV;

import java.util.Arrays;

public class LC_SetMisMatch_645 {
    public static void main(String[] args) {
        int[] nums = { 1,2,4,2};
        int[] ret = new int[2];
        ret = findErrorNums(nums);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] findErrorNums(int[] nums) {
        int[] ret = new int[2];
        int i = 0;
        while( i < nums.length){
            int correct= nums[i] - 1;
            if(nums[correct] != nums[i]){
                swap(nums , i , correct);
            }
            else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                ret[0] = nums[index];
                ret[1] = index + 1;
            }
        }
        return ret;
    }

    private static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
