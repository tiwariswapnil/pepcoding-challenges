package io.github.pepcoding.recursionandbacktracking.introductiontorecursion;

import java.util.Scanner;

public class PowerLinear {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x, n));
    }

    public static int power(int x, int n){
        if(n == 0) return 1;
        if(n == 1) return x;
        return x * power(x, n - 1);
    }

}
