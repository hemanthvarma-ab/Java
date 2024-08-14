/*
Make a menu driven program. The user can enter 2 numbers, either 1 or 0. If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
 */
import java.util.Scanner;
public class hello{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("enter 0 or 1 :");
            n=sc.nextInt();
            if(n==1){
                int marks;
                do{
                    System.out.println("enter marks: ");
                    marks=sc.nextInt();
                    if(marks>=90){
                        System.out.println("This is Good");
                    }
                    else if(marks>=60 && marks<=89){
                        System.out.println("This is Good as well");
                    }
                    else{
                        System.out.println("This is Good as well");
                    }
                }
                while(marks<0 || marks >100);
            }
            else{
                break;
            }
        }
        while(n!=0);
    }
}


