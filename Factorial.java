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
