package com.hu.springweb.Controller;

import java.util.*;

public class r {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();
        longestPalindrome(A);
    }

    private static boolean isPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
    // 暴力解法
    private static void longestPalindrome(String s) {
        int max = 0;
        Set<String> str = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len; i++)
            for (int j = i + 1; j <= len; j++) {
                String test = s.substring(i, j);
                if (isPalindromic(test)) {
                    if (test.length() > 1) {
                        str.add(test);
                    }
                    max = Math.max(max, test.length());
                }
            }
        System.out.println(str.size() + "," + max);
    }


}
