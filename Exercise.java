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
