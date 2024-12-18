import java.util.*;

class Node{                     // creation of Node
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    Node head=null;
    Node temp=null;

    public void addFirst(int data){          // Insertion at beginning 
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            temp=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
    }

    public void addLast(int data){         // Insertion at end
        Node nn=new Node(data);
        if(head==null){
            head=nn;
        }
        else{
            temp.next=nn;
            temp=nn;
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
        LinkedList ll=new LinkedList();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.display();
        ll.addLast(4);
        ll.addLast(5);
        ll.display();
    }
}


/*
      Output :
      1->2->3->null
      1->2->3->4->5->null
*/
