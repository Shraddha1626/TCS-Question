
/*
 * 🔢 Problem Statement: Digit Frequency Dominator
You are given a string s containing only digits (0–9).
Your task is to find the digit that appears the most number of times in the string.

If multiple digits have the same highest frequency, return the digit with the smallest value.

If the string is empty, return -1.

✅ Constraints:
Only digits 0–9 are present in the string.

In case of a tie, return the smallest digit.

If the input is empty, return -1.

📥 Input Format:
A single string s of digits
0 ≤ |s| ≤ 10⁵

📤 Output Format:
A single digit (0–9) with the highest frequency, or -1 if the string is empty.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Day15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String orginalNum = scan.nextLine();
        int n = orginalNum.length();
        for (int i = 0; i < n; i++) {
            if (orginalNum.charAt(i) >= 48 && orginalNum.charAt(i) <= 57) {
                continue;
            } else {
                System.out.println("-1");
                return;
            }
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = orginalNum.charAt(n - 1 - i) - '0'; 
        }
        Arrays.sort(arr);
        int[] arr2 = new int[n];
        int j = 0;
        int count = 0;
        int max = 0;
        int value = 0;
        while (j < n) {
            count = 0;
            for (int k = 0; k < n; k++) {
                if (arr[k] == arr[j]) count++;
            }
            arr2[j] = count;
            if (count > max) {
                max = count;
                value = arr[j];
            }
            j++;
        }
        System.out.println("MAX count: " + max);
        System.out.println("Number:" + value);

        scan.close();
    }
}
