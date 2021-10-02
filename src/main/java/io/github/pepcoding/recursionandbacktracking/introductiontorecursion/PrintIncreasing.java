package io.github.pepcoding.recursionandbacktracking.introductiontorecursion;

import java.util.Scanner;

public class PrintIncreasing {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        if (n == 0) return;
        printIncreasing(n - 1);
        System.out.println(n);
    }

}
