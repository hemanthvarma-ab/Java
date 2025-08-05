/*The electricity board has decided to charge money based on the units consumed by a particular home. 
If the units consumed are less than or equal to 200, the cost for one unit is 0.5paise.
 If the unit is less than or equal to 400, the cost for one unit is 0.65paise plus Rs.100 extra charge.
 If the unit is less than or equal to 600, the cost for one unit is 0.80paise plus Rs.200 extra charge.
  If the unit is greater than 600 the cost for one unit is Rs.1.25 plus Rs.425 extra charge. 
  You need to calculate the electricity bill based on the units consumed.
 */
import java.util.*;
public class Task2_2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int unit=sc.nextInt();
        double cost;
        if (unit<=200){
            cost=0.5*unit;
        }
        else if (200 < unit && unit <=400){
            cost=(0.65*unit)+100;
        }
        else if (400<unit && unit<=600){
            cost=(0.8*unit)+200;
        }
        else{
            cost=(1.25*unit)+425;
        }
        System.out.println("Rs. "+ cost);
    }
}
