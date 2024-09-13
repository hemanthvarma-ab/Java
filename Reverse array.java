// Reversing an array without using Recurrsion

import java.util.*;
class hello{
    static void printarray(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void reversearray(int[] arr,int n){
        int p1=0,p2=n-1;
        while (p1<p2) {
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;
            p2--;
        }
        printarray(arr,n);
    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("orginal array : ");
        printarray(arr,n);
        System.out.println();
        reversearray(arr, n);
    }
}
