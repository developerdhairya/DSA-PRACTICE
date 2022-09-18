import java.util.*;
import java.io.*;
//Reverse array in group of size k
class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;

    public static void main(String[] args){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        solution(arr,k);
        for(int ele:arr){
            ps.print(ele+" ");
        }
    }

    public static void solution(int[] arr,int k){
        int i=0;
        int j=k-1;
        int n=arr.length;

        while(j<n){
            reverse(arr,i,j);
            i+=k;
            j+=k;
        }
        reverse(arr,j-k+1,n-1); // Going back(j-k) and reversing and revesing leftover array from (j-k+1) to (n-1) 

    }

    public static void reverse(int[] arr,int p,int q){
        int i=p;
        int j=q;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}