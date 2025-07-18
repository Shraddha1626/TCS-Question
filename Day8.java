
import java.util.Scanner;

public class Day8 {
    public static int magic(int x,int n){
        int p=1;
        int result=0;
        while(x>0){
            int digit=((x%10)+n)%10;
            result+=(digit)*p;
            p*=10;
            x/=10;
        }
        return result;
    } 
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x=scan.nextInt();
        System.out.print("Enter the number 2: ");
        int n=scan.nextInt();

        
        System.out.println("result: "+magic(x,n));
        scan.close();

    }
}
