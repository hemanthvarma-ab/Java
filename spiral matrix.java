import java.util.*;
class hello{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int rowstart=0,colstart=0,rowend=n-1,colend=m-1;
        
        while (rowstart<=rowend && colstart<=colend) {
            for(int i=colstart;i<=colend;i++){
                System.out.print(arr[rowstart][i]+" ");
            }
            rowstart++;
            for(int i=rowstart;i<=rowend;i++){
                System.out.print(arr[i][colend]+" ");
            }
            colend--;
            for(int i=colend;i>=colstart;i--){
                System.out.print(arr[rowend][i]+" ");
            }
            rowend--;
            for(int i=rowend;i>=rowstart;i--){
                System.out.print(arr[i][colstart]+" ");
            }
            colstart++;
        }
    }
}
