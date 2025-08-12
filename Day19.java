/*

Day 19 Challenge — Regular Expression Matching
Problem:
Given an input string s and a pattern p, implement regular expression matching with support for the special characters . and *.

. → Matches any single character.
* → Matches zero or more of the preceding element.
The matching must cover the entire input string (not partial matches).

Example Inputs & Outputs:
Example 1: s = "aa", p = "a"     → false  
Example 2: s = "aa", p = "a*"    → true  
Example 3: s = "ab", p = ".*"    → true  
Full Regex Guide for this problem:

. → Any character
* → Zero or more of the preceding element
(Other regex features like +, ?, {n}, etc. are not required for this challenge — only . and * are supported.)


 */
import java.util.Scanner;
public class Day19 {
    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int j = 2; j <= n; j++) {
            if (p.charAt(j - 1) == 42) {
                dp[0][j] = dp[0][j - 2];
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char pc = p.charAt(j - 1);
                char sc = s.charAt(i - 1);

                if (pc == 46 || pc == sc) { 
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else if (pc == 42) {
                    char prev = p.charAt(j - 2);
                    dp[i][j] = dp[i][j - 2];
                    if (prev == 46 || prev == sc) {
                        dp[i][j] |= dp[i - 1][j];
                    }
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("s = ");
        String s = scan.next();
        System.out.print("p = ");
        String p = scan.next();
        scan.close();

        boolean result = isMatch(s, p);
        System.out.println(result);
    }
}
