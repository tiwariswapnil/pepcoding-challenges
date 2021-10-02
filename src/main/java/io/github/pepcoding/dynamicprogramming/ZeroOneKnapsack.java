package io.github.pepcoding.dynamicprogramming;

import java.util.Scanner;

public class ZeroOneKnapsack {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for(int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        int[] w = new int[n];
        for(int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }

        int cap = sc.nextInt();

        int[][] dp = new int[n + 1][cap + 1];

        for(int i = 0; i < n + 1; i++) {
            for(int j = 0; j < cap + 1; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    if(j >= w[i - 1]) {
                        int val = dp[i - 1][j - w[i - 1]] + v[i - 1];
                        dp[i][j] = Math.max(dp[i - 1][j], val);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
        }
        System.out.println(dp[n][cap]);
    }
}
