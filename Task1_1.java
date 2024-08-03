import java.util.Scanner;
public class Task1_1{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        if (length>0 && breadth>0){
            int area=length*breadth;
            int perimeter=2*(length+breadth);
            System.out.println("The required length is "+perimeter+" m");
            System.out.println("The requires area of carpet is "+area+" sqm");
        }
        else{
            System.out.println("enter the positive values");
        }
    }
}