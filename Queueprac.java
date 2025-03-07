import java.util.*;

class Queue{
    private int start,end,currsize,maxsize;
    private int arr[];
    public Queue(){
        arr=new int[16];
        start=-1;
        end=-1;
        currsize=0;
    }
    public Queue(int maxsize){
        this.maxsize=maxsize;
        arr=new int[maxsize];
        start=-1;
        end=-1;
        currsize=0;
    }
    public void push(int element){
        if(currsize==maxsize){
            System.out.println("Queue overflow");
        }else{
            if(end==-1){
                start=0;
                end=0;
            }else{
                end=end+1;
            }
            arr[end]=element;
            currsize++;
        }
    }
    public int pop(){
        if(start==-1){
            System.out.println("Queue underflow");
        }
        int popped=arr[start];
        if(currsize==1){
            start=-1;
            end=-1;
        }else{
            start=start+1;
        }
        currsize--;
        return popped;
    }
    public int top(){
        if(start==-1){
            System.out.println("Queue is empty");
        }
        return arr[start];
    }
    public int size(){
        return currsize;
    }
}

class Queueprac{

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue q=new Queue(n);
        for(int i=0;i<n;i++){
            q.push(sc.nextInt());
        }
        System.out.println(q.size());
        System.out.println(q.top());
        System.out.println(q.pop());
        System.out.println(q.size());
        System.out.println(q.top());
        System.out.println(q.pop());
        System.out.println(q.size());
        System.out.println(q.top());
    }
}