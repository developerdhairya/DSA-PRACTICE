import java.util.*;
import java.io.*;
// Minimum Subarray sum
class Main{
    static Scanner sc=new Scanner(Ssytem.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;++){
            arr[i]=sc.nextInt();
        }
        ps.print(kadane(arr));
    }
    public static int kadane(int[] arr){
        int n=arr.length;
         int sum=Integer.MAX_VALUE;
        int csum=0;
        for(int i=0;i<n;i++){
            if(arr[i]+csum>arr[i]){
                csum=arr[i];
            }else{
                csum+=arr[i];
            }
            sum=Math.min(csum,sum);
        }
        return sum;
    }


    }