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

/*  4. Inverted Half Pyramid with Numbers
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */

import java.util.Scanner;

 class hello{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
 }


/*  5. Floyd's Triangle
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */

import java.util.Scanner;

 class hello{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
 }

/*  6. 0-1 Triangle
1
0 1
0 1 0
1 0 1 0
1 0 1 0 1
 */

import java.util.Scanner;

 class hello{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               if(num%2==0){
                System.out.print(0+" ");
               }
               else{
                System.out.print(1+" ");
               }
               num++;
            }
            System.out.println();
        }
    }
 }


/* 7. solid rhombus
    *****
   *****
  *****
 *****
*****
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
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
 }


/* 8.  Number pyramid.
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
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
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
 }

/* 9. Butterfly pattern

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

 */
import java.util.Scanner;
 class hello{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
 }

/* 10. Palindrome Pyramid
    1
   212
  32123
 4321234
543212345

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
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
 }
