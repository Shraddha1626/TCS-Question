/*
 * 
 * 📌 Problem: Longest Substring Without Repeating Characters

You’re given a string s consisting of English letters, digits, symbols, and spaces.
Your task is to find the length of the longest substring that doesn’t contain any duplicate characters.

⚠️ Remember — a substring is a continuous portion of the string (unlike a subsequence).

Example:

Input: "abcabcbb" → Output: 3 (Substring: "abc")

Input: "pwwkew" → Output: 3 (Substring: "wke")

Input: "bbbbb" → Output: 1 (Substring: "b")


 */
import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {
            String result = "";
            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (result.indexOf(ch) != -1) {
                    break; 
                }

                result += ch;
                maxLength = Math.max(maxLength, result.length());
            }
        }

        System.out.println(maxLength);
        scan.close();
    }
}
