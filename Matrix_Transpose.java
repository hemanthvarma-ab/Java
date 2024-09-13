// For a given matrix of N x M, print its transpose.

import java.util.*;
public class hello {

   public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int arr[][]=new int[n][m];
       int transarr[][]=new int[n][m];
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
       }
       System.out.println("Orginal array :");
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(arr[i][j]);
        }
        System.out.println();
       }
       System.out.println("Transpose of array :");
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            transarr[i][j]=arr[j][i];
        }
       }
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(transarr[i][j]);
        }
        System.out.println();
       }
   }
}
