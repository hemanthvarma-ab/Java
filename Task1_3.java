/* Leena wanted to start a business and she was looking for a venture capitalist. Through her friend, she met a 
construction company owner Meena, who was interested in investing in an emerging business. 
Looking at the business proposal, the owner was very much impressed with Leena's work. 
So she decided to invest in Leena's business and hence gave a green signal to go ahead with the project. 
Leena got a loan of Rs. X for a period of Y years from the owner at R% interest per annum. 
Find the rate of interest and the total amount to be returned by Leena to the owner. 
The owner was impressed by the proper repayment of the financed amount and decides to give a 
special offer of a 2% discount on the total interest at the end of the settlement. 
Find the discount amount and also find the total amount given back by Leena.

Note: All rupee values should be in two decimal points.

Input Format
Input consists of 3 floating point values. The first one corresponds to the principal amount borrowed by Leena. The second one corresponds to the rate of interest The third one corresponds to the number of years.

Constraints
NA

Output Format
The output consists of 4 floating point values. The first value corresponds to the interest. The second value corresponds to the amount. The third value corresponds to the discount. The last value corresponds to the final settlement. All floating point values are to be rounded off to two decimal places.

Sample Input 0
100
1
10
Sample Output 0
10.00
110.00
0.20
109.80
Sample Input 1
40
1
10
Sample Output 1
4.00
44.00
0.08
43.92

 */

import java.util.Scanner;
public class Task1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float principal_amount=sc.nextFloat();
        float year=sc.nextFloat();
        float interest=sc.nextFloat();
        float rateofinterest=principal_amount*interest*year/100;
        float amount=principal_amount+rateofinterest;
        double discount=0.02*rateofinterest;
        double final_amount=amount-discount;
        System.out.println(rateofinterest);
        System.out.println(amount);
        System.out.println(discount);
        System.out.println(final_amount);
    }
}
