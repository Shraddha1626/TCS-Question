/*
 * 💻 Day 16 Challenge: Zigzag Conversion
 * 
📘 Problem Story:
You're given a string that needs to be written in a zigzag pattern over a given number of rows.
Once placed, read the characters line by line to form a new string.

🎯 Your Task:
Implement the following function
string convert(string s, int numRows);

🧪 Examples:
Example 1:
Input:
s = "PAYPALISHIRING", numRows = 3

Zigzag Pattern:
P   A   H   N  
A P L S I I G  
Y   I   R  
Output:
"PAHNAPLSIIGYIR"

Example 2:
Input:
s = "PAYPALISHIRING", numRows = 4

Zigzag Pattern:
P     I    N  
A   L S  I G  
Y A   H R  
P     I  
Output:
"PINALSIGYAHRPI"

Example 3:
Input:
s = "A", numRows = 1

Output:
"A"

✅ Constraints:
    1 <= s.length <= 1000

    s consists of English letters (uppercase/lowercase).

    1 <= numRows <= 1000

 */

import java.util.Scanner;

public class Day16 {
    public static void convert(String s, int numRows) {
        if (numRows <= 1 || s.length() <= numRows) {
            System.out.println(s);
            return;
        }
        char[][] zigzag = new char[numRows][s.length()];
        for (char[] row : zigzag) {   
            java.util.Arrays.fill(row, ' ');    
        }
        int row = 0, col = 0;
        boolean goingDown = true;
        for (int i = 0; i < s.length(); i++) {
        
            zigzag[row][col] = s.charAt(i);

            if (row == 0) goingDown = true;
            else if (row == numRows - 1) goingDown = false;

            if (goingDown) {
                row++;  
            } 
            else {
                row--;
                col++;
            }
        }
        for (char[] r : zigzag) {
            for (char c : r) {   
                System.out.print(c == ' ' ? "  " : c + " ");    
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=scan.next();
        System.out.print("Enter the numOfRows: ");
        int num=scan.nextInt();
        convert(str,num);
        scan.close();
    }
}
