// Write a program to print Fibonacci series of n terms where n is input by user : 
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

import java.util.*;
public class hello {
    public static void fibonacci(int n){
        int x=0;
        int y=1;
        int z;
        System.out.print("0 "+"1 ");
      for(int i=2;i<=n;i++){
        z=x+y;
        x=y;
        y=z;
        System.out.print(z+" ");
      }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        fibonacci(a);
    }
}
