import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
    public void preorder(Node root){
        if(root==null) return;
        
        preorder(root.left);
        
        preorder(root.right);
        System.out.print(root.data+" ");
    }
}

public class Treeprac {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Node tree=new Node(5);
        tree.left=new Node(4);
        tree.right=new Node(6);
        tree.left.left=new Node(1);
        tree.left.right=new Node(2);
        tree.right.left=new Node(3);
        tree.right.right=new Node(7);
        tree.preorder(tree);
    }
}
