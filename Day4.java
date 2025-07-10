
import java.util.Scanner;
import java.util.Arrays;


public class Day4 {

    public static void track(int[] arr,int count,int i){
        int Length=arr.length-1;
        while(i<Length){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            i++;
        }
        count++;
        i=0;
        if(count!=Length){
            track(arr,count,i);
        }
    } 
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of size of Array: ");
        int n=scan.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Original Array: "+Arrays.toString(arr));

        int i=0;
        int count=1;
        track(arr,count,i);
        System.out.println("Track Array: "+Arrays.toString(arr));
        scan.close();
    }
}
