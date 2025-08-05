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
}
class BinaryTree{
    int i=-1;
    public Node preorderBuildTree(int[] arr){  // input is in preorder sequence
        i++;
        if(i>=arr.length || arr[i]==-1) return null;
        Node newNode=new Node(arr[i]);
        newNode.left=preorderBuildTree(arr);
        newNode.right=preorderBuildTree(arr);
        return newNode;
    }

    public Node levelorderBuildTree(int[] arr){  //input is in level-order sequence
        if(arr.length==0 || arr[0]==-1) return null;
        Queue<Node> q=new LinkedList<>();
        int j=1;
        Node root=new Node(arr[0]);
        q.add(root);
        while(!q.isEmpty() && j<arr.length){
            Node newNode=q.poll();
            if(j<arr.length && arr[j]!=-1){
                newNode.left=new Node(arr[j]);
                q.add(newNode.left);
            }
            j++;
            if(j<arr.length && arr[j]!=-1){
                newNode.right=new Node(arr[j]);
                q.add(newNode.right);
            }
            j++;
        }
        return root;
    }

    public void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
}
    
public class Treeprac {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int[] arr = new int[parts.length];
        for(int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        BinaryTree bt=new BinaryTree();
        Node root=bt.levelorderBuildTree(arr);
        bt.inorder(root);
        System.out.println();
        bt.preorder(root);
        System.out.println();
        bt.postorder(root);
    }
}
