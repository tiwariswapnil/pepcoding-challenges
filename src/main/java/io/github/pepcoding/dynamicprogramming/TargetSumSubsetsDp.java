package io.github.pepcoding.dynamicprogramming;

import java.util.Scanner;

public class TargetSumSubsetsDp {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int tar = sc.nextInt();

        boolean[][] dp = new boolean[n + 1][tar + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < tar + 1; j++) {
                if (j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = false;
                } else {
                    if (j >= arr[i - 1]) {
                        dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
        }

        System.out.println(dp[n][tar]);
    }

}
