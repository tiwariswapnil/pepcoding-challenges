package io.github.pepcoding.dynamicprogramming;

import java.util.Scanner;

public class CoinChangePermutations {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int amt = sc.nextInt();

        int[] dp = new int[amt + 1];
        dp[0] = 1;

        for (int j = 0; j < amt + 1; j++) {
            for (int coin : arr) {
                if (j >= coin) dp[j] += dp[j - coin];
            }
        }

        System.out.println(dp[amt]);
    }

}
