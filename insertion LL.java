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

    public void addMiddle(int data,int k){         // Insertion at Middle
        Node nn=new Node(data);
        Node temp=head;
        int count=1;
        while(count+1!=k){
            temp=temp.next;
            count++;
        }
        Node temp1=temp.next;
        temp.next=nn;
        nn.next=temp1;
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

    public void deletelast(){
        Node temp1=head;
        while(temp1.next.next!=null){
            temp1=temp1.next;
        }
        temp1.next=null;
    }

    public void deletefirst(){
        Node temp2=head;
        head=head.next;
        temp2=null;
    }

    public void deleteMiddle(int k){
        int count=1;
        Node temp=head;
        while(count+1!=k){
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
    }
    
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void Size(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        System.out.println("Size= "+count);
    }

}

class Practice{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.Size();
        ll.display();
        ll.addLast(4);
        ll.addLast(5);
        ll.display();
        ll.deleteMiddle(3);
        ll.display();
        ll.Size();
        ll.addMiddle(3, 3);
        ll.display();
        ll.Size();
    }
}


/*
      Output :
      Size= 3
      3->2->1->null
      3->2->1->4->5->null
      3->2->4->5->null
      Size= 4
      3->2->3->4->5->null
      Size= 5
*/
