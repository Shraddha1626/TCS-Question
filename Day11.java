/*
## 🍬 Day 11 Challenge: **"Save The Prisoner"**
In a high-security prison, prisoners are seated **around a circular table**, each with a unique **chair number** from `1` to `n`.
A random chair number is picked, and from there, a **sweet is passed one-by-one** to the next prisoner in a clockwise direction. However, the **last sweet is awful** and must be **avoided at all costs**!

### 🧠 Your Task:
Identify the **prisoner (chair number)** who will receive the **final, awful treat**, based on:
* Total number of prisoners `n`
* Total number of sweets `m`
* Starting chair number `s`

### 📥 Input Format:
* First line: An integer `t` — the number of test cases.
* Next `t` lines: Each contains three space-separated integers:
  * `n` — number of prisoners
  * `m` — number of sweets
  * `s` — starting chair number

### 📤 Output Format:
* For each test case, print the **chair number** of the prisoner who receives the **awful last sweet**.

### 🔍 Example:
**Input:**
2
5 2 1
7 19 2

**Output:**
2
6

 */

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Number of Test cases: ");
        int t=scan.nextInt();
        int j=0;
        int[] chairN=new int[t];
        while(j<t){
            //System.out.print("Number of prisoners, Sweets & Chair number to start distribution: ");
            int n=scan.nextInt();
            int m=scan.nextInt();
            int s=scan.nextInt();
            int[] arr=new int[n];

            int start=s-1;
            int count=0;
            while(count<m){
                if(start==(n-1)){
                    arr[start]+=1;
                    start=0;
                }
                else {
                    arr[start]+=1;
                    start++;
                }
                count++;
            }
            chairN[j]=start;
            j++;
        }

        System.out.println("\n\nChair Number of prisoner :");
        for(int k=0;k<t;k++){
            System.out.println(chairN[k]);
        }
        scan.close();
    }
}
