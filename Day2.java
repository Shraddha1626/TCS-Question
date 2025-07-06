

/*
### 🚀 Day 2 Challenge — Alice’s Reward Game

🧠 **Problem: Maximizing Reward Points**

Alice has introduced a new **online game** with N levels (1 to N). Each day, Alice will **launch one level**, but the order is **random** and not necessarily increasing.

* A level **cannot be launched twice**.
* Players can only play **higher levels** than the ones they have completed.
* A player earns **1 reward point** for each level they complete.

🔍 **Your task** is to find the **maximum number of reward points** a player can earn based on the given launch order.

### 📥 Input Format:
1. Integer **N** (number of levels)
2. N space-separated integers (level launch order)

### 📤 Output Format:
Print the **maximum reward points** the player can earn.

### 🧪 Example:
**Input:**
5  
2 1 3 4 5

**Output:**
4

### 🧩 Explanation:
The best the player can do is play levels in increasing order.
From the sequence \[2, 1, 3, 4, 5], the **longest increasing subsequence** is \[1, 3, 4, 5] → **4 reward points**.


*/
import java.util.Scanner;


public class Day2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the number of Levels : ");
        int n=scan.nextInt();

        int[] arr=new int [n];
        System.out.print("Enter the levels: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        int points=0;
        int max=-1;
        int i=0;
        while(i<n){
            if(max<arr[i]){
                points++;
                max=arr[i];
            }
            i++;
        }

        System.out.print("Maximum reward points the player can earn: "+ points);

        scan.close();
    }
}
