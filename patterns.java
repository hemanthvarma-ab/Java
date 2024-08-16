/* 1. Inverted & Rotated Half Pyramid 
   *
  **
 ***
****
 
 */

import java.util.Scanner;

 class hello{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for( int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
 }

/* 2. Hollow Rectangle

*****
*   *
*   *
*****

*/

import java.util.Scanner;

 class hello{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
 }

/* 3. Half Pyramid with Numbers
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */

import java.util.Scanner;

 class hello{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
 }

*/
