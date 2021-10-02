package io.github.pepcoding.recursionandbacktracking.recursioninarrays;

import java.util.Scanner;

public class LastIndex {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(lastIndex(arr, n - 1, x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == -1) {
            return -1;
        }

        if(arr[idx] == x)
            return idx;
        else
            return lastIndex(arr, idx - 1, x);
    }

}
