/*
 * 🔁 Rearrange Multiples of 10
Problem Statement:
Given an array Arr[ ] of N integers, rewrite the array by moving all multiples of 10 to the end while preserving the order of other elements.

📌 Conditions:
Order of non-multiples of 10 must remain unchanged.

Order of multiples of 10 must also remain unchanged.

📥 Input Format:
An integer N – The size of the array. (1 ≤ N ≤ 1000)

An array Arr[ ] of N integers.

📤 Output Format:
Print the modified array where all multiples of 10 are at the end.

🧪 Example:
Input:
5  
1 20 3 40 5

Output:
1 3 5 20 40
 */

 
import java.util.Scanner;
import java.util.Arrays;

public class Day13 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        int count=0;
        for(int k=0;k<arr.length;k++){
            if(arr[k]%10==0){
                count++;
            }
        }
        int i=0;
        int totalZ=0;
        while(i<arr.length && totalZ!=count){
            int invalue=i;
            if(arr[i]%10==0){
                int temp=arr[i];
                totalZ++;
                for(int j=i+1;j<arr.length &&i< arr.length-1;j++){
                    arr[i]=arr[j];
                    i++;
                }
                arr[i]=temp;
                i=invalue;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        scan.close();
    }
}
