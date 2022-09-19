import java.util.*;
import java.io.*;


//Zig Zag Traversal
// Naive tc=>O(nlog(n))
//Note:Output is different in optimized approach and that is to be followed
//This approach may generate error in test compiler and is only for reference
// Read the below approach first

class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        zigzag(arr);
        for(int ele:arr){
            ps.print(ele+" ");
        }
    }
    public static void zigzag(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        int i=1;
        while(i<=n-2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i+=2;
        }
    }
}


// Approach to be followed in interview and test
// TC=>O(n)
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
        zigzag(arr);
        for(int ele:arr){
            ps.print(ele+" ");
        }
    }
    public static void zigzag(int[] arr){
        int n=arr.length;
        int i=0;
        while(i<=n-2){
            if( i%2==0 && arr[i]>arr[i+1]){
                swap(arr,i,i+1);
            }else if(i%2!=0 && arr[i]<arr[i+1]){
                swap(arr,i,i+1);
            }
            i++;
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}