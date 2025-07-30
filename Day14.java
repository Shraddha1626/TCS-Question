/*
## 🚗 Car Rental Cost Calculation

### 📘 Problem Story:

A travel agency charges two different hourly rates for car rentals:

* **Rate R1** for the first **N hours**
* **Rate R2** for any **additional hours**

Given the total travel time in **minutes**, calculate the total cost.

> 🔹 **Note:** Total travel time must be **rounded up** to the next whole hour.
> Example:
>
> * 90 minutes → 2 hours
> * 121 minutes → 3 hours

### 🔢 Input Format:
You are given four integers:
* `R1`: Cost per hour for the first `N` hours (1 ≤ R1 ≤ 1000)
* `N`: Number of hours charged at rate `R1` (1 ≤ N ≤ 100)
* `R2`: Cost per hour **after** `N` hours (1 ≤ R2 ≤ 1000)
* `X`: Total travel time in **minutes** (1 ≤ X ≤ 5 × 10⁴)

### 📤 Output Format:
* A **single integer** representing the **total cost in rupees**.

### ✅ Example:
**Input:**
20 4 40 300

**Output:**
120

**Explanation:**
* 300 minutes = 5 hours (rounded up)
* First 4 hours: 4 × 20 = 80
* Remaining 1 hour: 1 × 40 = 40
* **Total cost = 80 + 40 = 120**
 */

 
import java.util.Scanner;

public class Day14 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Number of hours changed at rate :");
        int N=scan.nextInt();
        System.out.print("Cost per hour for the First N hours: ");
        int R1=scan.nextInt();
        System.out.print("Cost per hour after N hours: ");
        int R2=scan.nextInt();
        System.out.print("Total travel time in minutes: ");
        int X=scan.nextInt();

        int time=X%60;
        int tc=0;
        if (time==0){
            time=X/60;
        }
        else{
            time=(X/60)+1;
        }
        tc=(R1*N)+(R2*(time-N));
        System.out.println("Total cost in rupees: "+tc);
        scan.close();
    }
}
