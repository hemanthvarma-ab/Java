/*
Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number.
For example, if n is 10, the output should be “2, 3, 5, 7”. If n is 20, the output should be “2, 3, 5, 7, 11, 13, 17, 19”.

Input Format
Integer N

Constraints
no

Output Format
Print all primes smaller than or equal to n.

Sample Input 0
30

Sample Output 0
2 3 5 7 11 13 17 19 23 29

Sample Input 1
5

Sample Output 1
2 3 5  
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count=count+1;
                }
                if(count>2){
                    break;
                }
            }
            if(count==2){
                    System.out.print(i+" ");
                }
        }
    }
}
