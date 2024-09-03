//1. Enter 3 numbers from the user & make a function to print their average.
import java.util.Scanner;
 class hello{
    public static void average(int n1,int n2,int n3){
        float avg=(n1+n2+n3)/3;
        System.out.println(avg);
    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        average(n1,n2,n3);
    }
 }

// 2. Write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;
 class hello{
    public static int oddsum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(oddsum(n));
    }
 }

// 3. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.Scanner;
public class hello {
    public static void counts(int n){
        int pos_count=0;
        int neg_count=0;
        int zero_count=0;
        for(int i=1;i<=n;i++){
            Scanner sc=new Scanner(System.in);
            int n1=sc.nextInt();
            if(n1>0) pos_count++;
            else if(n1<0) neg_count++;
            else zero_count++;
        }
        System.out.println("Number of positive numbers = "+pos_count);
        System.out.println("Number of negative numbers = "+neg_count);
        System.out.println("Number of zeros = "+zero_count);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of numbers you want : ");
        int n=sc.nextInt();
        counts(n);
    }
}

/* 4.Write a function that takes in the radius as input and returns the circumference of a circle.  */

import java.util.Scanner;
public class hello {
    public static double circumference(int r){
        double circum=2*Math.PI*r;
        return circum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        int r=sc.nextInt();
        System.out.println(circumference(r));
    }
}
