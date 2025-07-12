
/*
### 📌 Problem Statement: To Zero or Not Zero

In a quirky little village, a postal worker named **Nikhil** loves things to be perfectly aligned. He’s preparing a set of parcel IDs numbered from **`m` to `n`**. However, for the sake of beauty and uniformity, all IDs must be of the **same length as the number `n`**.
That means:
➡️ If a number has fewer digits than `n`, you must **add leading zeros** to make it the same length.


### 🔸 Input:

Two integers:

* `m`: the starting number (inclusive)
* `n`: the ending number (inclusive)


### 🔸 Output:

Print all numbers from `m` to `n`, one per line, **padded with leading zeros** to match the number of digits in `n`.

### 🔸 Example:

**Input:**

m = 5  
n = 42

**Output:**

```
005  
006  
007  
...  
042

### 🔸 Constraints:

* `1 ≤ m ≤ n ≤ 10^6`

 */


import java.util.Scanner;
public class Day5 {

    public static int leading(int n,int count){
        int temp=n;
        int count2=0;
        while(temp>0){
            temp/=10;
            count2++;
        }
        int k=count-count2;
        while(k>0){
            System.out.print("0");
            k--;
        }
        return n;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("n=");
        int n=scan.nextInt();
        System.out.print("m=");
        int m=scan.nextInt();
        int og=m;
        int count=1;
        while(og>0){
            og/=10;
            count++;
        }
        if(n<m){
            while(n<=m){
                System.out.println(leading(n,count));
                n++;
            }
        }
        else{
            System.out.println("Wrong input: ");
        }
        scan.close();
    }
}
