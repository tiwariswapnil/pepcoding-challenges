package io.github.pepcoding.recursionandbacktracking.recursioninarrays;

import java.util.Scanner;

public class DisplayArray {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        displayArr(arr, n);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx == 0) return;
        displayArr(arr, idx - 1);
        System.out.println(arr[idx - 1]);
    }

}
