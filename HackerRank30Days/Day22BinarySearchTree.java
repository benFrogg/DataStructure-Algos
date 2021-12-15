
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
