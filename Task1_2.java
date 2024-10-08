/*  Each Saturday, The Herald sells 'a' copies of a special edition newspaper for Rs. b per copy. 
The cost to him for printing each newspaper is Rs. c. He pays a fixed cost of Rs.100 per Saturday for storage, delivery, and so on.
 He wants to calculate the profit which it obtains only on Saturdays. 
 Can you please help him out by writing a program to compute the profit if a, b, and c are given?
Input Format
Input consists of 3 integers: a, b, and c. a is the number of copies sold, 
b is the cost per copy and c is the cost The Herald spends per copy.
Output Format
The output consists of a single integer which corresponds to the profit obtained by The Herald.
Sample Input 0
1000
2
1
Sample Output 0
900
Sample Input 1
600
4
2
Sample Output 1
1100
 */

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int profit=a*(b-c)-100;
        System.out.println(profit);
    }
}

