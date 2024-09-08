/* Example 1:
Input:N = 153
Explanation: 13+53+33 = 1 + 125 + 27 = 153 . 153 is Armstrong Number.
Example 2:
Input:N = 371
Explanation: 33+53+13 = 27 + 343 + 1 = 371 . 371 is Armstrong Number. 
*/

import java.util.*;
class hello{
    static boolean armstrong(int n){
        int sum=0;
        int n1=n;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+(int) Math.pow(rem, 3);
        }
        if(sum==n1) return true;
        else return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(armstrong(n)) System.out.println(n+" is an Armstrong number");
        else System.out.println(n+" is not an Armstrong number");
    }
}
