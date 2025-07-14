/*

## 🔢 Problem Statement – Oddly Even

In a world where phone numbers are encrypted using math patterns, Ayushi receives a suspicious number of up to **100 digits**.

Your task is to help her decode it by calculating the **absolute difference** between:

* The **sum of digits at odd positions** (1st, 3rd, 5th, ...)
* The **sum of digits at even positions** (2nd, 4th, 6th, ...)

> Positions are **1-based**, i.e., the first digit is at position 1.

---

### ✍️ Input Format:

* A single string of digits `s` of length up to **100**


### 🧾 Output Format:

* A single integer: the absolute difference between the sum of digits at odd positions and even positions

### 🧪 Examples:

#### Example 1:

**Input:**

4567
```

**Output:**

2
```

**Explanation:**

* Odd positions: 4 (1st) + 6 (3rd) = 10
* Even positions: 5 (2nd) + 7 (4th) = 12
* Absolute difference = |10 - 12| = **2**

### 💡 Constraints:

* `1 ≤ s.length() ≤ 100`
* `s[i]` is a digit character between `'0'` and `'9'`

 */
import java.util.Scanner;

public class Day6 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int N=scan.nextInt();
        int og=N;
        int count=0;
        while(og>0){
            og/=10;
            count++;
        }

        int i=0;
        int sumE=0;
        int sumO=0;
        while(i<count){
            int samp=N%10;
            if(i%2==0){
                sumE+=samp;
            }
            else{
                sumO+=samp;
            }
            N/=10;
            i++;
        }

        System.out.println("Absolute Differences: "+ (sumE-sumO));
        scan.close();
    }
}
