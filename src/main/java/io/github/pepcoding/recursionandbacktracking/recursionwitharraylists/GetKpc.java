package io.github.pepcoding.recursionandbacktracking.recursionwitharraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKpc {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> kpcList = getKPC(s);
        System.out.println(kpcList);
    }

    static String[] mapArray = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> emptyList = new ArrayList<>();
            emptyList.add("");
            return emptyList;
        }

        char ch = str.charAt(0);
        ArrayList<String> result = getKPC(str.substring(1));

        ArrayList<String> finalResult = new ArrayList<>();

        String map = mapArray[ch - '0'];

        int len = map.length();

        for (int i = 0; i < len; i++) {
            char c1 = map.charAt(i);
            for (String s : result) {
                finalResult.add(c1 + s);
            }
        }

        return finalResult;
    }
}
