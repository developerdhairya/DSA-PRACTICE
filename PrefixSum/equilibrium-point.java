// Find if equilibrium point exists in array

import java.util.*;
import java.io.PrintStream;
class Main{

    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;

    public static void main(String[] args){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ps.print(checkEqui(arr));
    }

    public static boolean checkEqui(int[] arr){
        int n=arr.length;
        int[] prefixArr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            prefixArr[i]=sum;
        }

        if(prefixArr[n-1]-prefixArr[0]==0){
            return true;
        }

        for(int i=1;i<n;i++){
            if(prefixArr[i-1]==prefixArr[n-1]-prefixArr[i]){
                return true;
            }
        }

        return false;

    }
}