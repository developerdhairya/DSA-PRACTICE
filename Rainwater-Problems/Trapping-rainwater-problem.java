import java.util.*;
import java.io.*;
//Trapping Rainwater Problem
class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ps.print(trp(arr));
    }
    public static int trp(int[] arr){
        int n=arr.length;
        int lm=Integer.MIN_VALUE;
        int rm=Integer.MIN_VALUE;
        int[] lprefix=new int[n];
        int[] rprefix=new int[n];
        for(int i=0;i<n;i++){
            lm=Math.max(lm,arr[i]);
            lprefix[i]=lm;
        }
        for(int i=n-1;i>=0;i--){
            rm=Math.max(rm,arr[i]);
            rprefix[i]=rm;
        }
        int output=0;
        for(int i=0;i<n;i++){
            int temp=Math.min(lprefix[i],rprefix[i])-arr[i];
            if(temp>0){
                output+=temp;
            }
        }
        return output;
    }
    }