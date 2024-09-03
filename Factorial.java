// Without using recurrsion

import java.util.Scanner;
 class hello{
    public static void factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial(n);
    }
 }

// Using recurrsion
import java.util.Scanner;
 class hello{
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        else return n*factorial(n-1);
    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factorialofnum=factorial(n);
        System.out.println(factorialofnum);
    }
 }
