/*

🧩 Day 18 Challenge — Linked List Puzzle

Problem: Swap Nodes in Pairs
Given a singly linked list, swap every two adjacent nodes and return the head of the modified list.
Important: You must swap the nodes themselves — do not modify the node values.

Input:
A singly linked list represented as an array for input clarity. (Actual implementations will use ListNode.)
head = [1, 2, 3, 4]
Output:
[2, 1, 4, 3]

More Examples:
Example 1:
Input: head = [1, 2, 3, 4]
Output: [2, 1, 4, 3]

Example 2:
Input: head = []
Output: []

Example 3:
Input: head = [1]
Output: [1]

Example 4:
Input: head = [1, 2, 3]
Output: [2, 1, 3]

Constraints:
Number of nodes in the list: 0 ≤ n ≤ 100
0 ≤ Node.val ≤ 100

 */

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
    }
}

public class singly {
    private static Node head;

    public static void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } 
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void display() {
        Node temp = head;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null){
                System.out.print(", ");
            }
            temp = temp.next;
        }
        System.out.println("]");
    }

    public static void swapPairs() {
        Node temp = head;
        while (temp != null && temp.next != null) {
            int t = temp.data;
            temp.data = temp.next.data;
            temp.next.data = t;
            temp = temp.next.next;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            insert(scan.nextInt());
        }

        System.out.print("Original list: ");
        display();

        swapPairs();

        System.out.print("After swapping: ");
        display();
        scan.close();
    }
}
