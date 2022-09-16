//Find Subarray with a given sum
// Constraint-All +ve numbers are there


// Naive Solution TC=>O(n^2)

import java.util.*;
import java.io.*;
class Main{

    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;

    public static void main(String[] args){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        ps.print(check(arr,sum));
    }

    public static boolean check(int[] arr,int sum){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int j=i;
            int currSum=0;
            while(currSum<sum && j<arr.length){
                currSum+=arr[j++];
            }
            if(currSum==sum){
                return true;
            }

        }
        return false;

    }
}

//Optimal Solution(Sliding window)

// TC=>O(n)
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
        int sum=sc.nextInt();
        ps.print(check(arr,sum));
    }

    public static boolean check(int[] arr,int sum){
        int n=arr.length;
        int i=0;
        int j=0;
        int csum=0;
        while(i<n && j<n){
            if(j>i){
                i=j;
                csum=arr[i];
            }
            if(csum<sum){
                csum+=arr[i++];
            }
            if(csum>sum){
                csum-=arr[j++];
            }
            if(csum==sum){
                return true;
            }
        }
        return false;
    }
    


}
