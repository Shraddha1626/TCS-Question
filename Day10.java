
/*
 * 🚀 #DecodeWithAyushDay10
🔷 Maximize Fuel Volume Within Budget
🧠 Problem Statement:
Vijay, a young industrialist, owns a fuel company with N distinct fuel containers, each having a price and a fuel volume. Hari, a fuel merchant, wants to buy fuel such that the total volume is maximized without exceeding a budget K.

📌 Condition: He can pick at most one container per category.

🎯 Objective:
Find the maximum total fuel volume Hari can purchase within the budget K.

📥 Input Format:
N: Number of fuel categories
K: Available budget
List of N integers → Prices[] of containers
List of N integers → Volumes[] of containers

📤 Output Format:
A single integer: Maximum fuel volume purchasable within the budget

📌 Example:
Input:
4 10  
4 8 5 3  
6 10 4 2

Output:
10

📌 Explanation:
Multiple combinations are possible, but the optimal one gives a total volume = 12 within the budget of 10 units.
 */


import java.util.Scanner;

public class Day10 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] price = new int[N];
        int[] volume = new int[N];
        
        System.out.print("Enter price: ");
        for (int i = 0; i < N; i++) {
            price[i] = sc.nextInt();
        }

        System.out.print("Enter volume for container: ");
        for (int i = 0; i < N; i++) {
            volume[i] = sc.nextInt();
        }

        int[] dp = new int[K + 1];

        for (int i = 0; i < N; i++) {
            for (int j = K; j >= price[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - price[i]] + volume[i]);
            }
        }

        System.out.println("Maximum total fuel volume: " + dp[K]);

        sc.close();
    }
}
