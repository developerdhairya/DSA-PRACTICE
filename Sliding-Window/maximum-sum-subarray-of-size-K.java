// Maximum sum subarray of size k

//Naive TC=>O(N*k)

import java.util.*;
import java.io.*;
class Main{

    static PrintStream ps=System.out;
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args){
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int output=maxSum(arr,k);
        ps.print(output);
        
    }

    public static int maxSum(int[] arr,int k){
        int n=arr.length;
        int i=0;
        int j=k-1;
        int sum=Integer.MIN_VALUE;

        while(j<n){
            int tSum=0;
            for(int p=i;p<=j;p++){
                tSum+=arr[p];
            }
            sum=Math.max(sum,tSum);
            i++;
            j++;
        }

        return sum;

    }
}

// Optimal TC=>O(n)  {Sliding window}

import java.util.*;
import java.io.*;
class Main{

    static PrintStream ps=System.out;
    static Scanner sc=new Scanner(System.in);


    public static void main(String[] args){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        ps.print(maxSum(arr,k));
    }


    public static int maxSum(int[] arr,int k){
        int n=arr.length;
        int output=0;
        int sum=0;
        int i=0;
        int j=0;
        for(;i<=k-1;i++){
            sum+=arr[i];
        }
        output=sum;
        while(i<n){
            sum+=arr[i++]-arr[j++];
            output=Math.max(output,sum);
        }

        return output;


    }


    }