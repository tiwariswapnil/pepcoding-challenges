package io.github.pepcoding.recursionandbacktracking.recursionwitharraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> subsequenceList = gss(s);
        System.out.println(subsequenceList);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0) {
            ArrayList<String> emptyList = new ArrayList<>();
            emptyList.add("");
            return emptyList;
        }

        char ch = str.charAt(0);
        ArrayList<String> result = gss(str.substring(1));

        ArrayList<String> finalResult = new ArrayList<>();

        for(String r : result) {
            finalResult.add("" + r);
        }

        for(String r : result) {
            finalResult.add(ch + r);
        }

        return finalResult;
    }

}
