package io.github.pepcoding.recursionandbacktracking.recursionwitharraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> mazePathsList = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(mazePathsList);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();

        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpaths = getMazePaths(sr, sc + ms, dr, dc);
            for (String path : hpaths) {
                paths.add("h" + ms + path);
            }
        }

        for (int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> vpaths = getMazePaths(sr + ms, sc, dr, dc);
            for (String path : vpaths) {
                paths.add("v" + ms + path);
            }
        }

        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
            ArrayList<String> dpaths = getMazePaths(sr + ms, sc + ms, dr, dc);
            for (String path : dpaths) {
                paths.add("d" + ms + path);
            }
        }

        return paths;
    }

}
