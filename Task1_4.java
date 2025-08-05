import java.util.*;

public class Task1_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float x1=sc.nextFloat();
        float y1=sc.nextFloat();
        float x2=sc.nextFloat();
        float y2=sc.nextFloat();
        float mid_x=(x1+x2)/2;
        float mid_y=(y1+y2)/2;
        System.out.println("Arun's house is located at ("+mid_x+","+mid_y+")");
    }
}