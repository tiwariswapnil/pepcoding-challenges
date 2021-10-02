package io.github.pepcoding.dynamicprogramming;

import java.util.Scanner;

public class ClimbStairsWithMinimumMoves {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Integer[] dp = new Integer[n + 1];
        dp[n] = 0;

        for (int i = n - 1; i >= 0; i--) {
            int jumps = arr[i];
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= jumps && i + j <= n; j++) {
                if (dp[i + j] != null) min = Math.min(min, dp[i + j]);
            }
            dp[i] = min != Integer.MAX_VALUE ? min + 1 : null;
        }

        System.out.println(dp[0]);
    }

}
