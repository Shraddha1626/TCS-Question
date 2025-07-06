

/*

📌 **Day 1 Challenge — TCS NQT**
🧠 **Problem: Nth Largest Unique Element**

Aman is sorting through his collection of high scores from a series of gaming tournaments. Each score is an integer, and some scores might be repeated due to ties.

He wants to find the **N-th largest unique score** from his record. Can you help Aman with a program that finds the N-th largest **distinct** element in the score list?

> If there are fewer than N unique scores, your program should return **-1**.

### **Input:**

n = 6  
arr = [4, 2, 7, 4, 9, 2]  
k = 3

### **Output:**
4

### **Explanation:**

Unique elements in descending order: **\[9, 7, 4, 2]**
3rd largest unique element is **4**

 */


import java.util.Scanner;
import java.util.Arrays;

public class Day1{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter the Nummber Elements: ");
        int n=scan.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the n- largest number: ");
        int k=scan.nextInt();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] unique = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                unique[j++] = arr[i];
            }
        }

        if (k >= 1 && k <= j) {
            System.out.println(k + "-th largest unique number is: " + unique[j - k]);
        } else {
            System.out.println("Out of range");
        }

        scan.close();


    }
}
