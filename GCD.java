// Write a function that calculates the Greatest Common Divisor of 2 numbers. 
// Without using Recursion

import java.util.*;
public class hello {
    public static int gcd(int a,int b){
        int q,rem;
        while(b!=0){
            q=a/b;
            rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
    }
}

//Using Recursion

import java.util.*;
public class hello {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
    }
}
