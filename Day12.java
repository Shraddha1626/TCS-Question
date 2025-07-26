/*
 * 🚀 #DecodeWithAyushDay12

📘 Replace Digits Game

🧠 Problem Story:
A game company is building a brain teaser for kids, where players must replace every digit in a given number with its mirror-opposite using a fixed mapping! The twist? The input number should be within a safe range, or the player loses the round! 😜

🎯 Objective:
Replace each digit in the number N using the following mapping:

Existing Digit	0	1	2	3	4	5	6	7	8	9
Replace By	9	8	7	6	5	4	3	2	1	0

📥 Input Format:
🔹 A single integer N

📤 Output Format:
🔸 A number with all digits replaced according to the table.
🔸 If N is not between 0 and 1,000,000 → Output "Wrong Input"

📄 Example:

Input:
105201

Output:
894798

 */

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String input = scan.next(); 

        
        if (!input.matches("\\d+")) {
            System.out.println("Wrong Input");
            return;
        }
        long number = Long.parseLong(input);
        if (number < 0 || number > 1_000_000) {
            System.out.println("Wrong Input");
            return;
        }

        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int digit = input.charAt(i) - '0';
            result.append(9 - digit);
        }

        
        System.out.println(result);
        scan.close();
    }
}
