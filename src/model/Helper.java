/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author minhduy
 */
public class Helper {
        
    
    public Helper(){
        
    }
    
        public String findSimilarWord(String searchText,Dictionary dict) {
        String suggestion = null;
        int minDistance = Integer.MAX_VALUE;

        for (String word : dict.getDict().keySet()) {
            int distance = calculateLevenshteinDistance(searchText, word);
            if (distance < minDistance) {
                minDistance = distance;
                suggestion = word;
            }
        }

        return suggestion;
    }
         public String findSimilarWordVN(String searchText,DictionaryVNtoEN dictionaryVNtoEN) {
        String suggestion = null;
        int minDistance = Integer.MAX_VALUE;

        for (String word : dictionaryVNtoEN.getDict().keySet()) {
            int distance = calculateLevenshteinDistance(searchText, word);
            if (distance < minDistance) {
                minDistance = distance;
                suggestion = word;
            }
        }

        return suggestion;
    }

    public int calculateLevenshteinDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    dp[i][j] = min(
                            dp[i - 1][j - 1] + (s1.charAt(i - 1) == s2.charAt(j - 1) ? 0 : 1),
                            dp[i][j - 1] + 1,
                            dp[i - 1][j] + 1
                    );
                }
            }
        }

        return dp[m][n];
    }
    public int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
