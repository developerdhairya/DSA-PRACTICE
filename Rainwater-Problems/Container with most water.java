import java.util.*;
import java.io.*;
// Container with most water volume
class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ps.print(sol(arr));
    }
    public static int sol(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        int maxvol=Integer.MIN_VALUE;
        while(i<j){
            int currvol=Math.min(arr[i],arr[j])*(j-i);
            if(arr[i]<arr[j]){
                i++;
            }else{
                j--;
            }
            maxvol=Math.max(maxvol,currvol);
        }
        return maxvol;
    }
}