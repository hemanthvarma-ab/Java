import java.util.*;
public class hello {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            reverse=10*reverse+rem;
        }
        System.out.println(reverse);
    }
}
