package com.sw;

public class SW0 {
public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println("Max sum of subarray is :\n"+findMaxSumSubarray(arr, k)); // Output: 9
}


public static int findMaxSumSubarray(int [] arr, int k){

    int windowSum = 0;
    int max = 0;

    //calculating the sum of first window
    for(int i= 0; i< k;i++) {
     windowSum+=arr[i];
    }

    max = windowSum;

    for(int i = k ; i < arr.length;i++) {
        windowSum = windowSum + arr[i] - arr[i-k];
        max = Math.max(max,windowSum);
    }

    return max;
}
}
/** Was an easy problem of sliding window
/** how we have slided the window by 1 element
/** Added right element and remove left element 
 * 
 * 
 * 
 * 
 *  */
