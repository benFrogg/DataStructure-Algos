/*
Task
The height of a binary search tree is the number of edges between the tree's root and its 
furthest leaf. You are given a pointer, root, pointing to the root of a binary search tree. 
Complete the getHeight function provided in your editor so that it returns the height of the 
binary search tree.


Input Format
The locked stub code in your editor reads the following inputs and assembles them into a 
binary search tree:
The first line contains an integer, n, denoting the number of nodes in the tree.
Each of the n subsequent lines contains an integer, data, denoting the value of an element 
that must be added to the BST.


Output Format
The locked stub code in your editor will print the integer returned by your getHeight 
function denoting the height of the BST.


Sample Input
7
3
5
2
1
4
6
7

Sample Output
3

Explanation 
The input forms the following BST:
                BST:
                |3|
            |2|     |5|
        |1|      |4|    |6|
                            |7|

    
The longest root-to-leaf path is shown below:
        Longest Root-to-Leaf Path
                |3|
                    |5|
                        |6|
                            |7|


There are 4 nodes in this path that are connected by 3 edges, meaning our BST's height = 3.
Thus, we print 3 as our answer.
*/

import java.util.*;

class Node22{
    Node22 left,right;
    int data;
    Node22(int data){
        this.data=data;
        left=right=null;
    }
}

class Day22BinarySearchTree {
    public static int getHeight(Node22 root){
        //Write your code here
        int leftHeight = 0;
        int rightHeight = 0;

        if (root.left != null) {
            leftHeight = getHeight(root.left) + 1;
        }

        if (root.right != null){
            rightHeight = getHeight(root.right) + 1;
        }
    
        if (leftHeight > rightHeight) {
            return leftHeight;
        } else {
            return rightHeight;
        }
    }
  
    public static Node22 insert(Node22 root,int data){
        if(root==null){
            return new Node22(data);
        }
        else{
            Node22 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node22 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);

        sc.close();
    }
}
