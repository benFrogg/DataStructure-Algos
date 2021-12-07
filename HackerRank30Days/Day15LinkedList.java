/*
A Node class is provided for you in the editor. A Node object has an integer data field, data, 
and a Node instance pointer, next, pointing to another node (i.e.: the next node in the list).

A Node insert function is also declared in your editor. 
It has two parameters: a pointer, head, pointing to the first node of a linked list, 
and an integer, data, that must be added to the end of the list as a new Node object.

Task
Complete the insert function in your editor so that it creates a new Node (pass data
as the Node constructor argument) and inserts it at the tail of the linked list
referenced by the head parameter. Once the new node is added, return the reference to
the head node.

Note: The head argument is null for an empty list.

Input Format
The first line contains T, the number of elements to insert.
Each of the next T lines contains an integer to insert at the end of the list.

Output Format
Return a reference to the head node of the linked list.

Sample Input

STDIN   Function
-----   -----------
4       T = 4
2       first data = 2
3
4
1       fourth data = 1

Sample Output
2 3 4 1

Explanation
T = 4, so your method will insert  nodes into an initially empty list.
First the code returns a new node that contains the data value 2 as the head of the list. 
Then create and insert nodes 3, 4, and 1 at the tail of the list.

Initial:    head -> null
T_0:    head -> data = 2 | null (Node n_0)

T_1:    head -> data = 2 | n_1 (Node n_0) -> data = 3 | null (Node n_1)

T_2:    head -> data = 2 | n_1 (Node n_0) -> data = 3 | n_2 (Node n_1) -> data = 4 | null (Node n_2)

T_3:    head -> data = 2 | n_1 (Node n_0) -> data = 3 | n_2 (Node n_1) -> data = 4 | n_3 (Node n_2) -> data = 1 | null (Node n_3)
*/

import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

public class Day15LinkedList {
    public static Node insert(Node head,int data) {
        //Complete this method
        if (head == null){
            return new Node (data);
        } else if (head.next == null){
            head.next = new Node (data);
        } else {
            insert (head.next, data);
        }

        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
