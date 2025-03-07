import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void mergesort(int []arr,int low,int mid,int high){
        ArrayList<Integer> arr1=new ArrayList<>();
        int n=arr.length;
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                arr1.add(arr[left]);
                left++;
            }
            else{
                arr1.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            arr1.add(arr[left]);
            left++;
        }
        while(right<=high){
            arr1.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=arr1.get(i-low);
        }
    }

    public static void merge(int []arr,int low, int high){
        int n=arr.length;
        if (low>=high) return;
        int mid=(low+high)/2;
        merge(arr,low,mid);
        merge(arr,mid+1,high);
        mergesort(arr,low,mid,high);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={6,7,8,2,4,5,3};
        int n=arr.length;
        merge(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

