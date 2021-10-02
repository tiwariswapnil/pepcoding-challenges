package io.github.pepcoding.dynamicprogramming;

import java.util.Scanner;

public class ClimbStairs {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        dp[n] = 1;

        for(int i = n - 1; i >= 0; i--) {
            if(i == n - 1) {
                dp[i] = dp[i + 1];
            } else if(i == n - 2) {
                dp[i] = dp[i+1] + dp[i+2];
            } else {
                dp[i] = dp[i + 1] + dp[i + 2] + dp[i + 3];
            }
        }
        System.out.println(dp[0]);
    }

}
