import java.util.*;
import java.io.*;
//Dutch National Flag
class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        dnf(arr);
        for(int i=0;i<n;i++){
            ps.print(arr[i]+" ");
        }
    }
    
    public static void dnf(int[] arr){
        int n=arr.length;
        int l=0,mid=0,r=n-1;
        while(mid<=r){
            if(arr[mid]==0){
                swap(arr,mid,l);
                mid++;
                l++;
            }else if(arr[mid]==1){
                mid++;
            }else if(arr[mid]==2){
                swap(arr,mid,r);
                r--;
            }
        }

    }


    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}