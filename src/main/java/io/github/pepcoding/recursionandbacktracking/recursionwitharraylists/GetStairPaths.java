package io.github.pepcoding.recursionandbacktracking.recursionwitharraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> stairPathsList = getStairPaths(n);
        System.out.println(stairPathsList);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            ArrayList<String> emptyList = new ArrayList<>();
            emptyList.add("");
            return emptyList;
        } else if (n < 0) {
            ArrayList<String> emptyList = new ArrayList<>();
            return emptyList;
        }

        ArrayList<String> paths1 = getStairPaths(n - 1);
        ArrayList<String> paths2 = getStairPaths(n - 2);
        ArrayList<String> paths3 = getStairPaths(n - 3);

        ArrayList<String> paths = new ArrayList<>();

        for(String s : paths1) {
            paths.add("1" + s);
        }

        for(String s : paths2) {
            paths.add("2" + s);
        }

        for(String s : paths3) {
            paths.add("3" + s);
        }

        return paths;
    }

}
