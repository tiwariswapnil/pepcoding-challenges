package io.github.pepcoding.recursionandbacktracking.recursioninarrays;

import java.util.Scanner;

public class MaxOfAnArray {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxOfArray(arr, 0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length - 1) {
            return arr[idx];
        }

        int mis = maxOfArray(arr, idx + 1);

        return Math.max(mis, arr[idx]);
    }

}
