/*Problem Statement — Minting Mints
At a fair-price shop, kids are queued up to collect mints 🍬.

Distribution Rules:
The first kid receives n mints.
Each subsequent kid receives 1 less than the sum of all mints distributed to the previous kids.

🔹 Input Format:
Two space-separated integers:
n: Mints received by the first kid (2 ≤ n < 10)
len: Total number of kids (1 < len < 20)

🔹 Output Format:
Print a single integer — the total number of mints distributed.

🔹 Sample Input:
Copy code
3 4
🔹 Sample Output:
Copy code
24
🔹 Explanation:
Kid 1 receives: 3
Kid 2 receives: 2 (3 - 1)
Kid 3 receives: 4 (3 + 2 - 1)
Kid 4 receives: 15 (3 + 2 + 4 - 1)
Total mints = 3 + 2 + 4 + 15 = 24
 */
import java.util.Scanner;

public class Day7 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int len=scan.nextInt();
        int sum=0;
        int i=0;
        int result=0;
        while(i<len-1){
            i++;
            if(result==0){
                sum+=n;
                result+=n;
            }
            else{
                sum=result-1;
                result+=sum;
            }
            System.out.println("Kid "+i+" : "+sum);
        }
        System.out.println("Total= "+result);
        scan.close();
    }    
}
