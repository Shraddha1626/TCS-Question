/*
### 🧠 **Problem: Selling Price Calculation**

In a shop, every item has an **alphanumeric code** printed on its label. Each **consecutive sequence of digits** in the code represents a **multi-digit number**.

You need to calculate the **selling price** of the item, which is the **sum of all such numbers** extracted from the alphanumeric code.

---

### 🔸 **Input**:

A single alphanumeric string `str`
(Contains both letters and digits, e.g., `"abc123xyz45pq9"`)


### 🔸 **Output**:

Print the sum of all multi-digit numbers found in the string.

### 🔸 **Example**:

**Input**:
`abc123xyz45pq9`
**Output**:
`177`


### 🔸 **Explanation**:

From the input string, the digit groups extracted are:

* `123`
* `45`
* `9`
  Their sum is:
  `123 + 45 + 9 = 177`


 */
import java.util.Scanner;

public class Day9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        int sum = 0;
        String currentNumber = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (Character.isDigit(ch)) {
                currentNumber += ch;
            } 
            else {
                if (!currentNumber.isEmpty()) {
                    sum += Integer.parseInt(currentNumber);
                    currentNumber = ""; 
                }
            }
        }
        
        if (!currentNumber.isEmpty()) {
            sum += Integer.parseInt(currentNumber);
        }
        
        System.out.println("Sum: " + sum);
        scan.close();
    }
}
