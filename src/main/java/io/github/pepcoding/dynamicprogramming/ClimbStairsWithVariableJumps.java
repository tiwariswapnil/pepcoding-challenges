package io.github.pepcoding.dynamicprogramming;

import java.util.Scanner;

public class ClimbStairsWithVariableJumps {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[n + 1];
        dp[n] = 1;

        for (int i = n - 1; i >= 0; i--) {
            int jumps = arr[i];
            for (int j = 1; j <= jumps && i + j <= n; j++) {
                dp[i] += dp[i + j];
            }
        }

        System.out.println(dp[0]);
    }

}
