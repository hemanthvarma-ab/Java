// Inserting a node at end    (node.next=tail , tail=node)   (uses tail)

import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){           //create new node
        this.data=data;
        this.next=null;
    }
}

class LL{
    Node head=null;
    Node tail=null;

    public void add(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            tail=nn;
        }
        else{                    //next points to new node  (insertion at end)
            tail.next=nn;        
            tail=nn;
        }
    }

    public void display(){
        Node temp=head;          // start from head
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

class Practice{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        LL l=new LL();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            l.add(arr[i]);
        }
        l.display();
    }
}


// Inserting a node at  front or begining   (node.next=head   , head=node)       (uses head)


import java.util.*;

class Node{                   
    int data;
    Node next;
    Node(int data){                           //create new node
        this.data=data;
        this.next=null;
    }
}

class LL{
    Node head=null;
    Node tail=null;
    public void add(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            tail=nn;
        }
        else{
            nn.next=head;                  //next points to new node  (insertion at front)
            head=nn;
        }
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

class Practice{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        LL l=new LL();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            l.add(arr[i]);
        }
        l.display();
    }
}








