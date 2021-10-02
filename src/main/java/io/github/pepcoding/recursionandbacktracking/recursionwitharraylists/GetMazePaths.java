package io.github.pepcoding.recursionandbacktracking.recursionwitharraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> mazePathsList = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(mazePathsList);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr < 0 || sc < 0 || sr > dr || sc > dc) {
            ArrayList<String> emptyList = new ArrayList<>();
            return emptyList;
        } else if(sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hPaths = getMazePaths(sr, sc + 1, dr, dc);
        ArrayList<String> vPaths = getMazePaths(sr + 1, sc, dr, dc);

        ArrayList<String> paths = new ArrayList<>();

        for(String s : hPaths) {
            paths.add("h" + s);
        }

        for(String s : vPaths) {
            paths.add("v" + s);
        }

        return paths;
    }

}
