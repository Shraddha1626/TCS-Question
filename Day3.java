
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String A: ");
        String a=scan.next();
        System.out.print("Enter the String B: ");
        String b=scan.next();
        String c="";
        
        for(int i=0;i<a.length();i++){
            boolean flag=false;
            for(int j=0;j<b.length();j++){
                if(a.charAt(i)==b.charAt(j)){
                    flag=true;
                }
            }
            if(!flag){
                c+=a.charAt(i);
            }
        }
        
        System.out.println("String C: "+c);
        scan.close();
    }
}
