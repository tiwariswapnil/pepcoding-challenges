package io.github.pepcoding.dynamicprogramming;

import java.util.Scanner;

public class UnboundedKnapsack {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }

        int cap = sc.nextInt();

        int[] dp = new int[cap + 1];

        for (int i = 0; i < cap + 1; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                if (w[j] <= i) {
                    int remValue = dp[i - w[j]];

                    max = Math.max(max, remValue + v[j]);
                }
            }
            dp[i] = max;
        }

        System.out.println(dp[cap]);
    }

}
